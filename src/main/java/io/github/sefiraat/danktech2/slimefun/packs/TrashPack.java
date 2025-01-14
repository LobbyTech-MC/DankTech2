package io.github.sefiraat.danktech2.slimefun.packs;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.Getter;
import org.bukkit.inventory.ItemStack;

public class TrashPack extends UnplaceableBlock {

    @Getter
    private final int tier;
    @Getter
    private final int slots;

    public TrashPack(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int tier) {
        super(itemGroup, item, recipeType, recipe);
        this.tier = tier;
        this.slots = tier * 2;
    }

	public int getSlots() {
		// TODO Auto-generated method stub
		return slots;
	}

	public int getTier() {
		// TODO Auto-generated method stub
		return tier;
	}
}
