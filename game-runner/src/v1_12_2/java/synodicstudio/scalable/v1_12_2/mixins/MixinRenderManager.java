package synodicstudio.scalable.v1_12_2.mixins;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import synodicstudio.scalable.core.scale.EntityScale;

@Mixin(RenderManager.class)
public class MixinRenderManager {

  @Inject(method = "renderEntity(Lnet/minecraft/entity/Entity;DDDFFZ)V", at = @At("HEAD"))
  private void scalable$pushScale(
      Entity entity,
      double x,
      double y,
      double z,
      float entityYaw,
      float partialTicks,
      boolean hideDebugBox,
      CallbackInfo callbackInfo
  ) {
    GlStateManager.pushMatrix();

    float factor = EntityScale.of(entity);
    if (!EntityScale.scales(factor)) {
      return;
    }

    GlStateManager.translate(x, y, z);
    GlStateManager.scale(factor, factor, factor);
    GlStateManager.translate(-x, -y, -z);
  }

  @Inject(method = "renderEntity(Lnet/minecraft/entity/Entity;DDDFFZ)V", at = @At("RETURN"))
  private void scalable$popScale(
      Entity entity,
      double x,
      double y,
      double z,
      float entityYaw,
      float partialTicks,
      boolean hideDebugBox,
      CallbackInfo callbackInfo
  ) {
    GlStateManager.popMatrix();
  }
}
