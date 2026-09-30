package synodicstudio.scalable.core.config;

import net.labymod.api.client.gui.screen.widget.widgets.input.SwitchWidget.SwitchSetting;
import net.labymod.api.configuration.loader.Config;
import net.labymod.api.configuration.loader.property.ConfigProperty;

public class AdvancedConfiguration extends Config {

  @SwitchSetting
  private final ConfigProperty<Boolean> changeEyeHeight = new ConfigProperty<>(false);

  public ConfigProperty<Boolean> changeEyeHeight() {
    return this.changeEyeHeight;
  }
}
