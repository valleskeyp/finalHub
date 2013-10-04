package com.valleskeyp.WebDefender;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Fly {
	
	private Sprite fly_sprite;
	private float breakOutTimer = 0;
	
	public Texture texture;
	public float xCoord, yCoord;
	public int fly_size;
	public int slotNumber;
	public boolean escaped = false;
	
	public Fly(float x, float y, int fly_type, int slot_number) { // set static data of fly(x, y, ect)
		xCoord = x;
		yCoord = y;
		fly_size = fly_type;
		slotNumber = slot_number;
		
		switch (fly_type) {
		case 1: // small fly
			texture = new Texture(Gdx.files.internal("data/medium_fly.png"));
			texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
			
			TextureRegion region = new TextureRegion(texture, 0, 0, 212, 143);
			
			fly_sprite = new Sprite(region);
			fly_sprite.setSize(.0745f, .06155f);
			fly_sprite.setOrigin(fly_sprite.getWidth()/2, fly_sprite.getHeight()/2);
			fly_sprite.setPosition(x, y);
			break;
		case 2: // small fly
			texture = new Texture(Gdx.files.internal("data/medium_fly.png"));
			texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
			
			region = new TextureRegion(texture, 0, 0, 212, 143);
			
			fly_sprite = new Sprite(region);
			fly_sprite.setSize(.0745f, .06155f);
			fly_sprite.setOrigin(fly_sprite.getWidth()/2, fly_sprite.getHeight()/2);
			fly_sprite.setPosition(x, y);
			break;
		case 3: // medium fly
			texture = new Texture(Gdx.files.internal("data/medium_fly.png"));
			texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
			
			region = new TextureRegion(texture, 0, 0, 212, 143);
			
			fly_sprite = new Sprite(region);
			fly_sprite.setSize(.115f, .097f);
			fly_sprite.setOrigin(fly_sprite.getWidth()/2, fly_sprite.getHeight()/2);
			fly_sprite.setPosition(x, y);
			break;
		case 4: // large fly
			texture = new Texture(Gdx.files.internal("data/medium_fly.png"));
			texture.setFilter(TextureFilter.Linear, TextureFilter.Linear);
			
			region = new TextureRegion(texture, 0, 0, 212, 143);
			
			fly_sprite = new Sprite(region);
			fly_sprite.setSize(.155f, .135f);
			fly_sprite.setOrigin(fly_sprite.getWidth()/2, fly_sprite.getHeight()/2);
			fly_sprite.setPosition(x, y);
			break;
			
		default:
			break;
		}
	}
	
	public void update() {
		
	}
	
	public void draw(SpriteBatch batch, float dt) {
		breakOutTimer += dt;
		fly_sprite.draw(batch);
		switch (fly_size) {
		case 1: // small fly
			if (breakOutTimer > 11) {
				escaped = true;
			}
			break;
		case 2: // small fly
			if (breakOutTimer > 11) {
				escaped = true;
			}
			break;
		case 3: // medium fly
			if (breakOutTimer > 8) {
				escaped = true;
			}
			break;
		case 4: // large fly
			if (breakOutTimer > 5) {
				escaped = true;
			}
			break;
			
		default:
			break;
		}
	}
	
	// follow with actions or things affecting the fly
	// ex. return the Fly for checks, animate actions
	
	public Sprite spriteReturn() {
		return fly_sprite;
	}
}
