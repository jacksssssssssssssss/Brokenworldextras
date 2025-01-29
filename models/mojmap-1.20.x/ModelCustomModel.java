// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelCustomModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custommodel"), "main");
	private final ModelPart bb_main;

	public ModelCustomModel(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -3.0F, -5.0F, 3.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 5)
						.addBox(-1.0F, -2.0F, 1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 12)
						.addBox(-1.0F, -2.0F, 2.0F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(17, 13)
						.addBox(-2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 16)
						.addBox(0.0F, -2.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 7)
						.addBox(-1.0F, -3.0F, 1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(17, 12)
						.addBox(-1.0F, -2.0F, 2.0F, 0.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 15)
						.addBox(-2.0F, -1.0F, 1.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 18)
						.addBox(-2.0F, -4.0F, -3.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 18)
						.addBox(1.0F, -3.0F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(4, 18)
						.addBox(2.0F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-1, 18)
						.addBox(-3.0F, -3.0F, -3.0F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(-2, 18)
						.addBox(-4.0F, -1.0F, -3.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(1, 9).addBox(1.0F, -3.0F, 0.0F, 3.0F, 3.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, 1.0F, 0.0F, 0.0F, -2.4435F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}