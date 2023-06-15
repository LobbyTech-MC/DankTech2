package io.github.sefiraat.danktech2.theme;

import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.utils.ChestMenuUtils;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GuiElements {

    public static final CustomItemStack MENU_BACKGROUND = new CustomItemStack(ChestMenuUtils.getBackground());

    public static final CustomItemStack MENU_BACKGROUND_INPUT = new CustomItemStack(ChestMenuUtils.getInputSlotTexture());
}
