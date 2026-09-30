package synodicstudio.scalable.v1_8_9.mixins;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import synodicstudio.scalable.core.scale.EntityScale;

@Mixin(RenderManager.class)
public class MixinRenderManager {

  @Inject(method = "doRenderEntity(Lnet/minecraft/entity/Entity;DDDFFZ)Z", at = @At("HEAD"))
  private void scalable$pushScale(
      Entity entity,
      double x,
      double y,
      double z,
      float entityYaw,
      float partialTicks,
      boolean hideDebugBox,
      CallbackInfoReturnable<Boolean> callbackInfo
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

  @Inject(method = "doRenderEntity(Lnet/minecraft/entity/Entity;DDDFFZ)Z", at = @At("RETURN"))
  private void scalable$popScale(
      Entity entity,
      double x,
      double y,
      double z,
      float entityYaw,
      float partialTicks,
      boolean hideDebugBox,
      CallbackInfoReturnable<Boolean> callbackInfo
  ) {
    GlStateManager.popMatrix();
  }
}
