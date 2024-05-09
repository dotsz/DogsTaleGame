package com.mygdx.dogstale;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;


public class Character {
    Sprite sprite;


    public Character(int width, int height, float x, float y){
        sprite = new Sprite(new Texture("hero1.png"));
        sprite.setSize(width, height);
        sprite.setPosition(x, y);
    }

    public void move(float x, float y){
        sprite.setPosition(x, y);
    }

    public void draw(SpriteBatch batch){
        sprite.draw(batch);
    }
}
