package com.item;

import com.item.ItemManager.I_Type;
import com.main.Main;
import com.sabrewulf.engine.graphics.texture.Texture;

public class Item {

	private boolean activateable;

	protected I_Type i_type;

	public Item(I_Type i_type) {

		this.i_type = i_type;
	}

	public void action() {

		// Action implemented on the consumer of item

	}

	public void use() {

		// Use item
	}

}
