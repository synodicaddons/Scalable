package synodicstudio.scalable.v26_1.mixins;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.entity.state.EntityRenderState;
import net.minecraft.client.renderer.state.level.CameraRenderState;
import net.minecraft.world.entity.Entity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import synodicstudio.scalable.v26_1.scale.ScaledRenderState;
import synodicstudio.scalable.core.scale.EntityScale;

@Mixin(EntityRenderDispatcher.class)
public class MixinEntityRenderDispatcher {

  @Inject(method = "extractEntity(Lnet/minecraft/world/entity/Entity;F)Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", at = @At("RETURN"))
  private void scalable$captureScale(
      Entity entity,
      float partialTicks,
      CallbackInfoReturnable<EntityRenderState> callbackInfo
  ) {
    EntityRenderState state = callbackInfo.getReturnValue();
    if (state == null) {
      return;
    }

    ((ScaledRenderState) state).scalable$factor(EntityScale.of(entity));
  }

  @Inject(method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/client/renderer/state/level/CameraRenderState;DDDLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;)V", at = @At("HEAD"))
  private void scalable$pushScale(
      EntityRenderState state,
      CameraRenderState cameraRenderState,
      double x,
      double y,
      double z,
      PoseStack poseStack,
      SubmitNodeCollector collector,
      CallbackInfo callbackInfo
  ) {
    poseStack.pushPose();

    float factor = ((ScaledRenderState) state).scalable$factor();
    if (!EntityScale.scales(factor)) {
      return;
    }

    poseStack.translate(x, y, z);
    poseStack.scale(factor, factor, factor);
    poseStack.translate(-x, -y, -z);
  }

  @Inject(method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lnet/minecraft/client/renderer/state/level/CameraRenderState;DDDLcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;)V", at = @At("RETURN"))
  private void scalable$popScale(
      EntityRenderState state,
      CameraRenderState cameraRenderState,
      double x,
      double y,
      double z,
      PoseStack poseStack,
      SubmitNodeCollector collector,
      CallbackInfo callbackInfo
  ) {
    poseStack.popPose();
  }
}
