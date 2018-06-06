package com.world;

import java.util.ArrayList;

import com.main.Main;
import com.sabrewulf.engine.application.Application;
import com.sabrewulf.engine.graphics.texture.TextureAtlas;
import com.sabrewulf.engine.maths.Vec2;
import com.sabrewulf.engine.scene.Scene;

public class World {

	private Main app;
	private Scene scene;
	private TextureAtlas textures;
	private ArrayList<TileID> tiles; 
	
	protected enum TileID{
		Void, Grass, Stone
	};
	
	public World(String path, Application app, Scene scene){
		
		this.app = (Main) app;
		this.scene = scene;
		
		this.textures = new TextureAtlas(app.getAssetManager().getTexture(path), 8, 8);
	}
	
	
	
	public Vec2[] getTileTexture(TileID id)
	{
		return textures.getElementUVs(id.ordinal());
	}
}
