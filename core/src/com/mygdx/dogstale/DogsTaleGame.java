package com.mygdx.dogstale;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;


public class DogsTaleGame extends ApplicationAdapter {

	private OrthographicCamera camera;
	private SpriteBatch spriteBatch;
	private	Character hero;


	public void create () {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 1280, 720);
		spriteBatch = new SpriteBatch();

		hero = new Character();
		hero.setPosition(15,15);




	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(0,0,0,1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		spriteBatch.begin();
		hero.draw(spriteBatch);
		spriteBatch.end();


		// Update
		hero.update(Gdx.graphics.getDeltaTime());

		Rectangle temp = new Rectangle(0,0, 1280,10);

		if(hero.hit(temp) == 1){
			hero.action(1, 10, 10);
		}

		//Controls

		if(Gdx.input.isKeyPressed(Input.Keys.A)){
			hero.moveLeft(Gdx.graphics.getDeltaTime());
		}
		if(Gdx.input.isKeyPressed(Input.Keys.D)){
			hero.moveRight(Gdx.graphics.getDeltaTime());
		}
		if(Gdx.input.isKeyPressed(Input.Keys.SPACE)){
			hero.jump();
		}


	}



	@Override
	public void dispose () {


	}

	@Override
	public void resize(int width, int height) {

	}



}
