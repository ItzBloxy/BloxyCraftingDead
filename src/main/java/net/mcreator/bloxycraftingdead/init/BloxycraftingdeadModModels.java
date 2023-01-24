
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxycraftingdead.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.bloxycraftingdead.client.model.Modelsit;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class BloxycraftingdeadModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelsit.LAYER_LOCATION, Modelsit::createBodyLayer);
	}
}
