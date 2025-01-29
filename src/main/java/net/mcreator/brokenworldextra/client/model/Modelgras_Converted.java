package net.mcreator.brokenworldextra.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelgras_Converted<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("broken_world_extra", "modelgras_converted"), "main");
	public final ModelPart granade;

	public Modelgras_Converted(ModelPart root) {
		this.granade = root.getChild("granade");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition granade = partdefinition.addOrReplaceChild("granade", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0F));
		PartDefinition cube_r1 = granade.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(17, 13).addBox(-0.5732F, -1.1161F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(16, 15).addBox(-0.5732F, -0.1161F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 12)
						.addBox(0.4268F, -1.1161F, 2.0F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 12).addBox(0.4268F, -1.1161F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 7)
						.addBox(0.4268F, -2.1161F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16).addBox(1.4268F, -1.1161F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(0.4268F, -1.1161F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-0.5732F, -2.1161F, -5.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4268F, -4.8839F, -1.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition cube_r2 = granade.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 9).addBox(-3.4874F, -2.2626F, 0.0F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.4268F, -5.8839F, 0.0F, -1.5708F, -0.8727F, 3.1416F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		granade.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
