package synodicstudio.scalable.core.config;

public final class ScaleRange {

  public static final int MIN_PERCENT = 10;
  public static final int MAX_PERCENT = 500;
  public static final int STEP_PERCENT = 5;
  public static final int DEFAULT_PERCENT = 100;

  private ScaleRange() {
  }

  public static float toFactor(int percent) {
    if (percent < MIN_PERCENT) {
      return MIN_PERCENT / 100.0F;
    }

    if (percent > MAX_PERCENT) {
      return MAX_PERCENT / 100.0F;
    }

    return percent / 100.0F;
  }
}
