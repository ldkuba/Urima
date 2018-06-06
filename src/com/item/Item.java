package com.item;

import com.sabrewulf.engine.graphics.texture.Texture;

import main.Main;

public class Item extends AbstractItem {

	private int id;
	private String i_name;
	private Texture i_img;

	protected enum I_Type {
		item1, item2, item3, item4, item5, item6
	}

	protected I_Type i_type;

	public Item(Main app, int id, String i_name, Texture i_img) {
		super(app);
		this.id = id;
		this.i_name = i_name;
		this.i_img = i_img;
	}

	@Override
	public void update() {
		switch (i_type) {

		case item1:

		case item2:

		case item3:

		case item4:

		case item5:

		case item6:
		}

	}

	@Override
	public void render() {

		switch (i_type) {

		case item1:

		case item2:

		case item3:

		case item4:

		case item5:

		case item6:
		}

	};

	public void action() {

		// Action implemented on the consumer of item

	}

	public void use() {

		// Use item
	}

}
