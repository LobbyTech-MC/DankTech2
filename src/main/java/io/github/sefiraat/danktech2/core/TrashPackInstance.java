package io.github.sefiraat.danktech2.core;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.inventory.ItemStack;

public class TrashPackInstance {

    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private int tier;
    @Getter
    @Setter
    private ItemStack[] items = new ItemStack[18];

    public TrashPackInstance(long id, int tier) {
        this.tier = tier;
        this.id = id;
    }

    public ItemStack getItem(int index) {
        return items[index];
    }

    public void setItem(int index, ItemStack itemStack) {
        items[index] = itemStack.clone();
    }

    public void clearItem(int index) {
        items[index] = null;
    }

	public int getTier() {
		// TODO Auto-generated method stub
		return tier;
	}

	public ItemStack[] getItems() {
		// TODO Auto-generated method stub
		return items;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setItems(ItemStack[] items) {
		// TODO Auto-generated method stub
		this.items = items;
	}

	public void setTier(int tier) {
		// TODO Auto-generated method stub
		this.tier = tier;
	}

}
