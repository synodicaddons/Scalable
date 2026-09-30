# Scalable

LabyMod 4 addon that scales your own model, other players, NPCs and every mob type individually.
Purely visual and client-side.

- Namespace: `scalable`
- Package: `synodicstudio.scalable`
- Built on `LabyMod/addon-template` (LabyGradle 0.9.0, Gradle 9.7.1 with `distributionSha256Sum`,
  workflow and subproject layout unchanged)
- Minecraft 1.8.9 through 26.3

## How the scaling works

Everything happens in the render layer. All entity rendering passes through a single point per
version — `RenderManager` on 1.8.9/1.12.2 and `EntityRenderDispatcher` from 1.16.5 onwards — and the
mixin wraps a matrix transform around exactly that call:

```
translate(x, y, z) -> scale(f, f, f) -> translate(-x, -y, -z)
```

`x, y, z` is the entity's foot point relative to the camera, so the model keeps standing on the same
block instead of floating or sinking. The renderer's own translation composes on top of it, which
gives "move to the feet, then scale" — and everything the renderer draws afterwards (model layers,
held items, name tags) inherits the same matrix automatically.

No packets are sent. Entity data, hitboxes, collision, reach, movement and attack logic are left
untouched. Other players see nothing.

## Eye height

`Advanced -> Change eye height` is off by default and carries a warning in its description. It is
the one part that a server can observe, because the eye position feeds into reach and
line-of-sight checks.

**Status:** the setting and the lookup (`EntityScale.eyeHeight()`) exist, but the mixin on
`Entity#getEyeHeight` has not been written yet. Until it is, the toggle does nothing. It has to be
implemented per version, just like the render mixin.

## Entity types

`MobScaleConfiguration` has one slider per type (84 of them), stored as whole percentages from 10 to
500 with a default of 100, which maps to a factor of 0.1-5.0 with a default of 1.0.
`ScaleRange.toFactor` does the translation.

Types that only exist in newer versions are grouped into sections and hidden through
`@SettingRequires` against hidden boolean properties, which `VersionAvailability` sets once at
startup. Renamed types (`zombie_pigman` / `zombified_piglin`, `snowman` / `snow_golem`,
`villager_golem` / `iron_golem`, `lava_slime` / `magma_cube`, the illager names from 1.11) point at
the same slider.

## Needs verifying in-game

`./gradlew build` compiles cleanly on all 21 versions. That says nothing about the mixin
descriptors, though — those are only resolved once the game starts. The following was written from
the documentation and official addons, and needs to be confirmed by running a client:

| What | Where | Verified against |
|---|---|---|
| `doRenderEntity(Lnet/minecraft/entity/Entity;DDDFFZ)V` | v1_8_9, v1_12_2 | MCP names as in `labymod-addons/itemphysics` |
| `render(...DDDFF PoseStack MultiBufferSource I)V` | v1_16_5 - v1_21_1 | Mojmap signatures in `itemphysics` |
| `render(...DDDF PoseStack MultiBufferSource I)V` | v1_21_3 - v26_3 | **not verified** — the render-state era dropped the yaw parameter, but the exact descriptor per version still needs checking |
| `MinecraftVersions.V*.orNewer()` | `VersionAvailability` | `orOlder()` is confirmed in `itemphysics`; `orNewer()` is assumed |
| `@SettingRequires`, `@SettingSection`, `@SliderSetting(min/max/steps)` | config classes | used in `customcrosshair`, `waypoints`, `itemphysics` |
| `Entity#entityId()` returns `ResourceLocation` | `ScaleResolver` | `labymod-addons/damageindicator` |
| `serverController().getCurrentServerData().address().getHost()` | `ServerRestriction` | `labymod-addons/minimap` |

Run `:game-runner:runClient1_21_11` (or whichever version you are testing on). If a mixin fails, it
shows up as an injection error with the exact descriptor in the log.

## Not implemented yet

- **Search field and per-slider reset button.** LabyMod's ordinary settings UI cannot render a
  search box or a reset button per row. `ScalableConfiguration.resetAll()` and
  `MobScaleConfiguration.resetAll()` exist and are ready to be called, but they need an Activity
  (search field + scroll list + slider + per-row reset) before they become reachable. This is the
  largest remaining piece of work.
- **Eye height mixin** (see above).
- **26.x mobs.** The entity list stops at `happy_ghast` (1.21.6); what 26.1-26.3 added has not been
  looked up yet.

## License

No license file added yet — pick one before publishing.
