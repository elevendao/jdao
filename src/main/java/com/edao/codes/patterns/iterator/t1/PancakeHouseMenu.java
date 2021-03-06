package com.edao.codes.patterns.iterator.t1;

import java.util.ArrayList;
import com.edao.codes.patterns.iterator.MenuItem;

public class PancakeHouseMenu {
	ArrayList menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
		
		addItem("K&B's Pancake Breakfast",
				"Pancakes with scrambled eggs, and toast",
				true,
				2.99);
		addItem("Regular Pancake Breakfast",
				"Pancake with fried eggs, sausage",
				false,
				2.99);
		addItem("Blueberry Pancakes",
				"Pancke made with fresh blueberries",
				true,
				3.49);
		addItem("Waffles",
				"Waffles, with your choice of blueberries or stawberries",
				true,
				3.59);
	}
	
	public void addItem(String name, String description, boolean vegetarian,
			double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public ArrayList getMenuItems() {
		return menuItems;
	}
	
	// ...
}
