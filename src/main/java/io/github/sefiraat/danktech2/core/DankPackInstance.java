package io.github.sefiraat.danktech2.core;

import lombok.Data;
import org.bukkit.inventory.ItemStack;

@Data
public class DankPackInstance {

    private long id;
    private int tier;
    private ItemStack[] items = new ItemStack[9];
    private int[] amounts = new int[9];
    private String lastUser = "未知";

    public DankPackInstance(long id, int tier) {
        this.tier = tier;
        this.id = id;
    }

    public ItemStack getItem(int index) {
        return items[index];
    }

    public int getAmount(int index) {
        return amounts[index];
    }

    public void setItem(int index, ItemStack itemStack) {
        items[index] = itemStack.clone();
    }

    public void clearItem(int index) {
        items[index] = null;
        amounts[index] = 0;
    }

    public void setAmount(int index, int amount) {
        amounts[index] = amount;
    }

	public int getTier() {
		// TODO Auto-generated method stub
		return tier;
	}

	public long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(long id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public String getLastUser() {
		// TODO Auto-generated method stub
		return lastUser;
	}

	public void setLastUser(String lastUser) {
		// TODO Auto-generated method stub
		this.lastUser = lastUser;
	}

	public void setTier(int tier) {
		// TODO Auto-generated method stub
		this.tier = tier;
	}

	public ItemStack[] getItems() {
		// TODO Auto-generated method stub
		return items;
	}

	public int[] getAmounts() {
		// TODO Auto-generated method stub
		return amounts;
	}

	public void setItems(ItemStack[] items) {
		// TODO Auto-generated method stub
		this.items = items;
	}

	public void setAmounts(int[] amounts) {
		// TODO Auto-generated method stub
		this.amounts = amounts;
	}
}
