package net.noozy.sculk;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.noozy.sculk.entity.ModEntities;
import net.noozy.sculk.entity.client.SpongebobRenderer;

public class SculkClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.SPONGEBOB, SpongebobRenderer::new);
    }
}
