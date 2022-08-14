package net.noozy.sculk.entity.client;

import net.noozy.sculk.Sculk;
import net.noozy.sculk.entity.custom.SpongebobEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SpongebobRenderer extends GeoEntityRenderer<SpongebobEntity> {
    public SpongebobRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new SpongebobModel());
    }

    @Override
    public Identifier getTextureResource(SpongebobEntity instance) {
        return new Identifier(Sculk.MOD_ID, "textures/entity/spongebob/spongebob.png");
    }
}