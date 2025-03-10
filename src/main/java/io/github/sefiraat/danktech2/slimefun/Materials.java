package io.github.sefiraat.danktech2.slimefun;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.sefiraat.danktech2.DankTech2;
import io.github.sefiraat.danktech2.theme.ThemeType;
import io.github.sefiraat.danktech2.utils.Skulls;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.Getter;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Materials {

    @Getter
    private static SlimefunItem dankCell1;
    @Getter
    private static SlimefunItem dankCell2;
    @Getter
    private static SlimefunItem dankCell3;
    @Getter
    private static SlimefunItem dankCell4;
    @Getter
    private static SlimefunItem dankCell5;
    @Getter
    private static SlimefunItem dankCell6;
    @Getter
    private static SlimefunItem dankCell7;
    @Getter
    private static SlimefunItem dankCell8;
    @Getter
    private static SlimefunItem dankCell9;

    public static void setup() {
        final DankTech2 plugin = DankTech2.getInstance();

        final SlimefunItemStack cell1Core = SlimefunItems.SYNTHETIC_DIAMOND;
        final ItemStack cell1Material = new ItemStack(Material.IRON_INGOT);
        final ItemStack cell2Material = new ItemStack(Material.GOLD_INGOT);
        final ItemStack cell3Material = new ItemStack(Material.IRON_BLOCK);
        final ItemStack cell4Material = new ItemStack(Material.GOLD_BLOCK);
        final ItemStack cell5Material = new ItemStack(Material.DIAMOND);
        final ItemStack cell6Material = new ItemStack(Material.EMERALD);
        final ItemStack cell7Material = new ItemStack(Material.DIAMOND_BLOCK);
        final ItemStack cell8Material = new ItemStack(Material.EMERALD_BLOCK);
        final ItemStack cell9Material = new ItemStack(Material.NETHER_STAR);

        // Cell - 1
        dankCell1 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_1",
                Skulls.CELL_1.getPlayerHead(),
                ThemeType.CRAFTING,
                "无底单元 - 等级 1",
                "无底单元可以在内部创建一个",
                "比外部更大的空间"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell1Material, cell1Material, cell1Material,
                cell1Material, cell1Core, cell1Material,
                cell1Material, cell1Material, cell1Material,
            }
        );

        // Cell - 2
        dankCell2 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_2",
                Skulls.CELL_2.getPlayerHead(),
                ThemeType.CRAFTING,
                "无底单元 - 等级 2",
                "无底单元可以在内部创建一个",
                "比外部更大的空间"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell2Material, cell2Material, cell2Material,
                cell2Material, dankCell1.getItem(), cell2Material,
                cell2Material, cell2Material, cell2Material,
            }
        );

        // Cell - 3
        dankCell3 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_3",
                Skulls.CELL_3.getPlayerHead(),
                ThemeType.CRAFTING,
                "无底单元 - 等级 3",
                "无底单元可以在内部创建一个",
                "比外部更大的空间"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell3Material, cell3Material, cell3Material,
                cell3Material, dankCell2.getItem(), cell3Material,
                cell3Material, cell3Material, cell3Material,
            }
        );

        // Cell - 4
        dankCell4 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_4",
                Skulls.CELL_4.getPlayerHead(),
                ThemeType.CRAFTING,
                "无底单元 - 等级 4",
                "无底单元可以在内部创建一个",
                "比外部更大的空间"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell4Material, cell4Material, cell4Material,
                cell4Material, dankCell3.getItem(), cell4Material,
                cell4Material, cell4Material, cell4Material,
            }
        );

        // Cell - 5
        dankCell5 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_5",
                Skulls.CELL_5.getPlayerHead(),
                ThemeType.CRAFTING,
                "无底单元 - 等级 5",
                "无底单元可以在内部创建一个",
                "比外部更大的空间"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell5Material, cell5Material, cell5Material,
                cell5Material, dankCell4.getItem(), cell5Material,
                cell5Material, cell5Material, cell5Material,
            }
        );

        // Cell - 6
        dankCell6 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_6",
                Skulls.CELL_6.getPlayerHead(),
                ThemeType.CRAFTING,
                "无底单元 - 等级 6",
                "无底单元可以在内部创建一个",
                "比外部更大的空间"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell6Material, cell6Material, cell6Material,
                cell6Material, dankCell5.getItem(), cell6Material,
                cell6Material, cell6Material, cell6Material,
            }
        );

        // Cell - 7
        dankCell7 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_7",
                Skulls.CELL_7.getPlayerHead(),
                ThemeType.CRAFTING,
                "无底单元 - 等级 7",
                "无底单元可以在内部创建一个",
                "比外部更大的空间"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell7Material, cell7Material, cell7Material,
                cell7Material, dankCell6.getItem(), cell7Material,
                cell7Material, cell7Material, cell7Material,
            }
        );

        // Cell - 8
        dankCell8 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_8",
                Skulls.CELL_8.getPlayerHead(),
                ThemeType.CRAFTING,
                "无底单元 - 等级 8",
                "无底单元可以在内部创建一个",
                "比外部更大的空间"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell8Material, cell8Material, cell8Material,
                cell8Material, dankCell7.getItem(), cell8Material,
                cell8Material, cell8Material, cell8Material,
            }
        );

        // Cell - 9
        dankCell9 = new UnplaceableBlock(
            ItemGroups.MATERIALS,
            ThemeType.themedSlimefunItemStack(
                "DK2_CELL_9",
                Skulls.CELL_9.getPlayerHead(),
                ThemeType.CRAFTING,
                "无底单元 - 等级 ★",
                "无底单元可以在内部创建一个",
                "比外部更大的空间"
            ),
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[]{
                cell9Material, cell9Material, cell9Material,
                cell9Material, dankCell8.getItem(), cell9Material,
                cell9Material, cell9Material, cell9Material,
            }
        );

        // Slimefun Registry
        dankCell1.register(plugin);
        dankCell2.register(plugin);
        dankCell3.register(plugin);
        dankCell4.register(plugin);
        dankCell5.register(plugin);
        dankCell6.register(plugin);
        dankCell7.register(plugin);
        dankCell8.register(plugin);
        dankCell9.register(plugin);
    }

	public static SlimefunItem getDankCell1() {
		// TODO Auto-generated method stub
		return dankCell1;
	}
	public static SlimefunItem getDankCell2() {
		// TODO Auto-generated method stub
		return dankCell2;
	}
	public static SlimefunItem getDankCell3() {
		// TODO Auto-generated method stub
		return dankCell3;
	}
	public static SlimefunItem getDankCell4() {
		// TODO Auto-generated method stub
		return dankCell4;
	}
	public static SlimefunItem getDankCell5() {
		// TODO Auto-generated method stub
		return dankCell5;
	}
	public static SlimefunItem getDankCell6() {
		// TODO Auto-generated method stub
		return dankCell6;
	}
	public static SlimefunItem getDankCell7() {
		// TODO Auto-generated method stub
		return dankCell7;
	}
	public static SlimefunItem getDankCell8() {
		// TODO Auto-generated method stub
		return dankCell8;
	}
	public static SlimefunItem getDankCell9() {
		// TODO Auto-generated method stub
		return dankCell9;
	}
}
