package com.mygdx.dogstale;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;



public class DogsTaleGame extends ApplicationAdapter {


	private SpriteBatch spriteBatch;
	private	Character player;


	public void create () {
		player = new Character(64, 64, 16, 16);
		spriteBatch = new SpriteBatch();

	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		spriteBatch.begin();
		player.draw(spriteBatch);
		spriteBatch.end();
		inputHandler();

	}

	private void inputHandler(){
		if(Gdx.input.isKeyPressed(Input.Keys.W)){
			player.move(player.sprite.getX(), player.sprite.getY() + 8);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.S)){
			player.move(player.sprite.getX(), player.sprite.getY() - 8);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.A)){
			player.move(player.sprite.getX() - 8, player.sprite.getY());
		}
		if(Gdx.input.isKeyPressed(Input.Keys.D)){
			player.move(player.sprite.getX() + 8, player.sprite.getY());
		}
	}

	@Override
	public void dispose () {
		spriteBatch.dispose();
		player.sprite.getTexture().dispose();
	}

	@Override
	public void resize(int width, int height) {

	}



}
