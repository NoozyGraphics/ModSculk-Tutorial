package net.noozy.sculk.entity.client;

import net.minecraft.util.Identifier;
import net.noozy.sculk.Sculk;
import net.noozy.sculk.entity.custom.SpongebobEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SpongebobModel extends AnimatedGeoModel<SpongebobEntity> {
    @Override
    public Identifier getModelResource(SpongebobEntity entity) {
        return new Identifier(Sculk.MOD_ID,"geo/spongebob.geo.json");
    }

    @Override
    public Identifier getTextureResource(SpongebobEntity entity) {
        return new Identifier(Sculk.MOD_ID,"texture/entity/spongebob/spongebob.png");
    }

    @Override
    public Identifier getAnimationResource(SpongebobEntity entity) {
        return new Identifier(Sculk.MOD_ID,"animations/spongebob.animation.json");
    }
}