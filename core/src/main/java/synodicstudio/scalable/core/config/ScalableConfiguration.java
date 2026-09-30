package synodicstudio.scalable.core.config;

import net.labymod.api.addon.AddonConfig;
import net.labymod.api.client.gui.screen.widget.widgets.input.SliderWidget.SliderSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.client.gui.screen.widget.widgets.input.TextFieldWidget.TextFieldSetting;
import net.labymod.api.configuration.loader.annotation.ConfigName;
import net.labymod.api.configuration.settings.annotation.SettingRequires;
import net.labymod.api.configuration.settings.annotation.SettingSection;
import net.labymod.api.configuration.loader.property.ConfigProperty;

@ConfigName("settings")
public class ScalableConfiguration extends AddonConfig {

  @SwitchSetting
  private final ConfigProperty<Boolean> enabled = new ConfigProperty<>(true);

  @SettingSection("players")
  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> playerSize = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SliderSetting(min = ScaleRange.MIN_PERCENT, max = ScaleRange.MAX_PERCENT, steps = ScaleRange.STEP_PERCENT)
  private final ConfigProperty<Integer> otherPlayerSize = new ConfigProperty<>(ScaleRange.DEFAULT_PERCENT);

  @SwitchSetting
  private final ConfigProperty<Boolean> changeNpcSize = new ConfigProperty<>(true);

  @SettingSection("mobs")
  private final MobScaleConfiguration mobs = new MobScaleConfiguration();

  @SettingSection("servers")
  @SwitchSetting
  private final ConfigProperty<Boolean> restrictToServers = new ConfigProperty<>(false);

  @SettingRequires("restrictToServers")
  @TextFieldSetting
  private final ConfigProperty<String> serverAddresses = new ConfigProperty<>("");

  @SettingSection("advanced")
  private final AdvancedConfiguration advanced = new AdvancedConfiguration();

  @Override
  public ConfigProperty<Boolean> enabled() {
    return this.enabled;
  }

  public ConfigProperty<Integer> playerSize() {
    return this.playerSize;
  }

  public ConfigProperty<Integer> otherPlayerSize() {
    return this.otherPlayerSize;
  }

  public ConfigProperty<Boolean> changeNpcSize() {
    return this.changeNpcSize;
  }

  public MobScaleConfiguration mobs() {
    return this.mobs;
  }

  public ConfigProperty<Boolean> restrictToServers() {
    return this.restrictToServers;
  }

  public ConfigProperty<String> serverAddresses() {
    return this.serverAddresses;
  }

  public AdvancedConfiguration advanced() {
    return this.advanced;
  }

  public void resetAll() {
    this.playerSize.set(ScaleRange.DEFAULT_PERCENT);
    this.otherPlayerSize.set(ScaleRange.DEFAULT_PERCENT);
    this.mobs.resetAll();
  }
}
