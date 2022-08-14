package net.noozy.sculk.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.noozy.sculk.Sculk;
import net.noozy.sculk.entity.custom.SpongebobEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<SpongebobEntity> SPONGEBOB = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Sculk.MOD_ID, "spongebob"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, SpongebobEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.8f)).build());
}