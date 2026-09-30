package synodicstudio.scalable.core;

import net.labymod.api.addon.LabyAddon;
import net.labymod.api.models.addon.annotation.AddonMain;
import synodicstudio.scalable.core.config.ScalableConfiguration;
import synodicstudio.scalable.core.scale.ScaleResolver;
import synodicstudio.scalable.core.scale.ServerRestriction;
import synodicstudio.scalable.core.scale.VersionAvailability;

@AddonMain
public class ScalableAddon extends LabyAddon<ScalableConfiguration> {

  private static ScalableAddon instance;

  private ScaleResolver scaleResolver;

  public ScalableAddon() {
    ScalableAddon.instance = this;
  }

  public static ScalableAddon get() {
    return ScalableAddon.instance;
  }

  @Override
  protected void enable() {
    this.registerSettingCategory();

    ScalableConfiguration configuration = this.configuration();
    VersionAvailability.apply(configuration.mobs());

    ServerRestriction serverRestriction = new ServerRestriction(configuration);
    this.registerListener(serverRestriction);

    this.scaleResolver = new ScaleResolver(configuration, serverRestriction);
  }

  @Override
  protected Class<ScalableConfiguration> configurationClass() {
    return ScalableConfiguration.class;
  }

  public ScaleResolver scaleResolver() {
    return this.scaleResolver;
  }
}
