package com.item;

import com.main.Main;
import com.sabrewulf.engine.graphics.texture.TextureAtlas;
import com.sabrewulf.engine.maths.Vec2;

public class ItemManager {

	protected enum I_Type {
		Empty, Stick, item2, item3, item4, item5, item6
	}
	

	private TextureAtlas textures;
	private String path;

	public ItemManager(String path, Main app) {

		this.path = path;
		textures = new TextureAtlas(app.getAssetManager().getTexture(path), 8, 8);
	}

	public Vec2[] getItemTexture(I_Type id) {
		return textures.getElementUVs(id.ordinal());
	}

}
