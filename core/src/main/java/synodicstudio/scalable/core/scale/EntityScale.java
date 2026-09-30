package synodicstudio.scalable.core.scale;

import synodicstudio.scalable.core.ScalableAddon;

public final class EntityScale {

  private EntityScale() {
  }

  public static float of(Object entity) {
    ScalableAddon addon = ScalableAddon.get();
    if (addon == null) {
      return ScaleResolver.UNSCALED;
    }

    return addon.scaleResolver().scaleOf(entity);
  }

  public static boolean scales(float factor) {
    return Math.abs(factor - ScaleResolver.UNSCALED) > 1.0E-4F;
  }

  public static float eyeHeight() {
    ScalableAddon addon = ScalableAddon.get();
    if (addon == null) {
      return ScaleResolver.UNSCALED;
    }

    return addon.scaleResolver().eyeHeightScale();
  }
}
