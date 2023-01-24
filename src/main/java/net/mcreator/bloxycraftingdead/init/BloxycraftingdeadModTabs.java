
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloxycraftingdead.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BloxycraftingdeadModTabs {
	public static CreativeModeTab TAB_CRAFTING_DEAD;

	public static void load() {
		TAB_CRAFTING_DEAD = new CreativeModeTab("tabcrafting_dead") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BloxycraftingdeadModBlocks.BARREL_GREY.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
