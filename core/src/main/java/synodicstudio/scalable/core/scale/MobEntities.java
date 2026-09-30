package synodicstudio.scalable.core.scale;

import java.util.HashMap;
import java.util.Map;
import net.labymod.api.client.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

public final class MobEntities {

  private static final Map<String, String> KEYS_BY_PATH = new HashMap<>();

  private MobEntities() {
  }

  static void register(String key, String... paths) {
    for (String path : paths) {
      KEYS_BY_PATH.put(path, key);
    }
  }

  public static @Nullable String keyOf(@Nullable ResourceLocation entityId) {
    if (entityId == null) {
      return null;
    }

    return KEYS_BY_PATH.get(entityId.getPath());
  }

  static {
    register("armorStand", "armor_stand");
    register("bat", "bat");
    register("blaze", "blaze");
    register("caveSpider", "cave_spider");
    register("chicken", "chicken");
    register("cow", "cow");
    register("creeper", "creeper");
    register("enderDragon", "ender_dragon");
    register("enderman", "enderman");
    register("endermite", "endermite");
    register("ghast", "ghast");
    register("giant", "giant");
    register("guardian", "guardian");
    register("horse", "horse");
    register("ironGolem", "iron_golem", "villager_golem");
    register("magmaCube", "magma_cube", "lava_slime");
    register("mooshroom", "mooshroom");
    register("ocelot", "ocelot");
    register("pig", "pig");
    register("rabbit", "rabbit");
    register("sheep", "sheep");
    register("silverfish", "silverfish");
    register("skeleton", "skeleton");
    register("slime", "slime");
    register("snowGolem", "snow_golem", "snowman");
    register("spider", "spider");
    register("squid", "squid");
    register("villager", "villager");
    register("witch", "witch");
    register("wither", "wither");
    register("wolf", "wolf");
    register("zombiePigman", "zombie_pigman", "zombified_piglin", "pig_zombie");
    register("zombie", "zombie");
    register("elderGuardian", "elder_guardian");
    register("evoker", "evoker", "evocation_illager");
    register("vex", "vex");
    register("vindicator", "vindicator", "vindication_illager");
    register("illusioner", "illusioner", "illusion_illager");
    register("llama", "llama");
    register("donkey", "donkey");
    register("mule", "mule");
    register("skeletonHorse", "skeleton_horse");
    register("zombieHorse", "zombie_horse");
    register("husk", "husk");
    register("stray", "stray");
    register("witherSkeleton", "wither_skeleton");
    register("polarBear", "polar_bear");
    register("shulker", "shulker");
    register("parrot", "parrot");
    register("drowned", "drowned");
    register("phantom", "phantom");
    register("turtle", "turtle");
    register("cod", "cod");
    register("salmon", "salmon");
    register("pufferfish", "pufferfish");
    register("tropicalFish", "tropical_fish");
    register("dolphin", "dolphin");
    register("panda", "panda");
    register("cat", "cat");
    register("fox", "fox");
    register("pillager", "pillager");
    register("ravager", "ravager");
    register("traderLlama", "trader_llama");
    register("wanderingTrader", "wandering_trader");
    register("bee", "bee");
    register("hoglin", "hoglin");
    register("piglin", "piglin");
    register("piglinBrute", "piglin_brute");
    register("strider", "strider");
    register("zoglin", "zoglin");
    register("axolotl", "axolotl");
    register("glowSquid", "glow_squid");
    register("goat", "goat");
    register("allay", "allay");
    register("frog", "frog");
    register("tadpole", "tadpole");
    register("warden", "warden");
    register("camel", "camel");
    register("sniffer", "sniffer");
    register("armadillo", "armadillo");
    register("bogged", "bogged");
    register("breeze", "breeze");
    register("creaking", "creaking");
    register("happyGhast", "happy_ghast");
  }
}
