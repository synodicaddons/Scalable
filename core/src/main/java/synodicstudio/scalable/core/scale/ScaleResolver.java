package synodicstudio.scalable.core.scale;

import java.util.UUID;
import net.labymod.api.Laby;
import net.labymod.api.client.entity.Entity;
import net.labymod.api.client.entity.player.ClientPlayer;
import net.labymod.api.client.entity.player.Player;
import net.labymod.api.configuration.loader.property.ConfigProperty;
import synodicstudio.scalable.core.config.ScalableConfiguration;
import synodicstudio.scalable.core.config.ScaleRange;

public final class ScaleResolver {

  public static final float UNSCALED = 1.0F;

  private final ScalableConfiguration configuration;
  private final ServerRestriction serverRestriction;

  public ScaleResolver(ScalableConfiguration configuration, ServerRestriction serverRestriction) {
    this.configuration = configuration;
    this.serverRestriction = serverRestriction;
  }

  public float scaleOf(Object entity) {
    if (!this.isActive() || !(entity instanceof Entity labyEntity)) {
      return UNSCALED;
    }

    if (labyEntity instanceof Player player) {
      return this.playerScale(player);
    }

    String key = MobEntities.keyOf(labyEntity.entityId());
    if (key == null) {
      return UNSCALED;
    }

    ConfigProperty<Integer> property = this.configuration.mobs().byKey().get(key);
    if (property == null) {
      return UNSCALED;
    }

    return ScaleRange.toFactor(property.get());
  }

  public float eyeHeightScale() {
    if (!this.isActive() || !this.configuration.advanced().changeEyeHeight().get()) {
      return UNSCALED;
    }

    return ScaleRange.toFactor(this.configuration.playerSize().get());
  }

  private float playerScale(Player player) {
    if (player instanceof ClientPlayer) {
      return ScaleRange.toFactor(this.configuration.playerSize().get());
    }

    if (this.isNpc(player) && !this.configuration.changeNpcSize().get()) {
      return UNSCALED;
    }

    return ScaleRange.toFactor(this.configuration.otherPlayerSize().get());
  }

  private boolean isNpc(Player player) {
    UUID uniqueId = player.getUniqueId();
    return uniqueId == null || uniqueId.version() != 4;
  }

  private boolean isActive() {
    return this.configuration.enabled().get()
        && Laby.labyAPI().minecraft().isIngame()
        && this.serverRestriction.isAllowed();
  }
}
