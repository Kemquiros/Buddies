package me.man_cub.buddies.inventory;

import org.spout.api.inventory.Inventory;

public class EntityInventory extends Inventory {
	private static final long serialVersionUID = 1L;
	public static final int SIZE = 2;
	
	public EntityInventory() {
		super(SIZE);
	}
	
}
