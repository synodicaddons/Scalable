package synodicstudio.scalable.core.scale;

import net.labymod.api.loader.MinecraftVersions;
import synodicstudio.scalable.core.config.MobScaleConfiguration;

public final class VersionAvailability {

  private VersionAvailability() {
  }

  public static void apply(MobScaleConfiguration configuration) {
    configuration.applyAvailability(
        MinecraftVersions.V1_12_2.orNewer(),
        MinecraftVersions.V1_16_5.orNewer(),
        MinecraftVersions.V1_17_1.orNewer(),
        MinecraftVersions.V1_19_4.orNewer(),
        MinecraftVersions.V1_20_1.orNewer(),
        MinecraftVersions.V1_20_6.orNewer(),
        MinecraftVersions.V1_21_4.orNewer(),
        MinecraftVersions.V1_21_8.orNewer()
    );
  }
}
