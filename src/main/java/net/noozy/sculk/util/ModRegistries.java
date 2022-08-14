package net.noozy.sculk.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.noozy.sculk.entity.ModEntities;
import net.noozy.sculk.entity.custom.SpongebobEntity;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAttributes();
    }
    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.SPONGEBOB, SpongebobEntity.setAttributes());
    }
}
