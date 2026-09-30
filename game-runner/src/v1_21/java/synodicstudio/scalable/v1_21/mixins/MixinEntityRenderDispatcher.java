package synodicstudio.scalable.v1_21.mixins;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import synodicstudio.scalable.core.scale.EntityScale;

@Mixin(EntityRenderDispatcher.class)
public class MixinEntityRenderDispatcher {

  @Inject(method = "render(Lnet/minecraft/world/entity/Entity;DDDFFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", at = @At("HEAD"))
  private void scalable$pushScale(
      Entity entity,
      double x,
      double y,
      double z,
      float entityYaw,
      float partialTicks,
      PoseStack poseStack,
      MultiBufferSource bufferSource,
      int packedLight,
      CallbackInfo callbackInfo
  ) {
    poseStack.pushPose();

    float factor = EntityScale.of(entity);
    if (!EntityScale.scales(factor)) {
      return;
    }

    poseStack.translate((float) x, (float) y, (float) z);
    poseStack.scale(factor, factor, factor);
    poseStack.translate((float) -x, (float) -y, (float) -z);
  }

  @Inject(method = "render(Lnet/minecraft/world/entity/Entity;DDDFFLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/MultiBufferSource;I)V", at = @At("RETURN"))
  private void scalable$popScale(
      Entity entity,
      double x,
      double y,
      double z,
      float entityYaw,
      float partialTicks,
      PoseStack poseStack,
      MultiBufferSource bufferSource,
      int packedLight,
      CallbackInfo callbackInfo
  ) {
    poseStack.popPose();
  }
}
