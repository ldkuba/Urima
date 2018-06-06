package com.item;

import main.Main;

public abstract class AbstractItem {

	protected Main app;

	public AbstractItem(Main app) {

		this.app = app;
	}

	public abstract void update();

	public abstract void render();

}
