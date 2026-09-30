package synodicstudio.scalable.v26_3.mixins;

import net.minecraft.client.renderer.entity.state.EntityRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import synodicstudio.scalable.v26_3.scale.ScaledRenderState;

@Mixin(EntityRenderState.class)
public class MixinEntityRenderState implements ScaledRenderState {

  @Unique
  private float scalable$factor = 1.0F;

  @Override
  public float scalable$factor() {
    return this.scalable$factor;
  }

  @Override
  public void scalable$factor(float factor) {
    this.scalable$factor = factor;
  }
}
