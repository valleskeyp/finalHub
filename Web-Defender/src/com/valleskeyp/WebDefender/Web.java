package com.valleskeyp.WebDefender;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Web {
	
	private Sprite web;
	
	public Texture texture;
	public float xCoord, yCoord;
	public String web_type;
	public boolean isBroken = false;
	public int slotNumber;
	public boolean hasFly = false;
	
	public Web(float x, float y, String web_area, int slot_number) {
		xCoord = x;
		yCoord = y;
		web_type = web_area;
		slotNumber = slot_number;
		
		if (web_area.equals("top")) {
			texture = new Texture(Gdx.files.internal("data/top_web.png"));
			texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);

			TextureRegion region = new TextureRegion(texture, 0, 0, 160, 160);

			web = new Sprite(region);
			web.setSize(.2f, .2f);
			web.setOrigin(web.getWidth()/2, web.getHeight()/2);
			web.setPosition(x, y);
		} else if (web_area.equals("bottom")) {
			texture = new Texture(Gdx.files.internal("data/bottom_web.png"));
			texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);

			TextureRegion region = new TextureRegion(texture, 0, 0, 160, 160);

			web = new Sprite(region);
			web.setSize(.2f, .2f);
			web.setOrigin(web.getWidth()/2, web.getHeight()/2);
			web.setPosition(x, y);
		}
	}
	
	public void update() {
		
	}
	
	public void draw(SpriteBatch batch, float dt) {
		web.draw(batch);
	}
	
	// follow with actions or things affecting the fly
	// ex. return the Fly for checks, animate actions
	
	public Sprite spriteReturn() {
		return web;
	}
}
