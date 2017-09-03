package com.parth.consumerestwebservice.vo;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	List<Menu> menu_items;
	
	public Restaurant() {
		menu_items = new ArrayList<>();
	}

	
	public List<Menu> getMenu_items() {
		return menu_items;
	}


	public void setMenu_items(List<Menu> menu_items) {
		this.menu_items = menu_items;
	}


	@Override
    public String toString() {
        return "menu_items[ \n" +
                menu_items +
                '}';
    }
	
	
}
