package com.mygdx.dogstale;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Character {
    Rectangle bottom, left, right, top;
    Sprite sprite;
    Texture texture;
    int action;
    float velocityY;

    public Character(){
        bottom = new Rectangle(0,0, 100,100);
        texture = new Texture(Utils.getInternal("hero1.png"));
        sprite = new Sprite(texture);
        sprite.setSize(64, 64);
        this.setPosition(0,0);
        velocityY = 0;
    }

    public int hit(Rectangle r){
        if(bottom.overlaps(r)){
            return 1;
        }
        return -1;
    }

    public void action(int type, float x, float y){
        if (type == 1){
            velocityY = 0;
            setPosition(bottom.x, y);
        }
    }

    public void update (float delta){
        velocityY -= 30 * delta;
        bottom.y += velocityY;
        sprite.setPosition(bottom.x, bottom.y);
    }

    public void setPosition(float x, float y){
        bottom.x = x;
        bottom.y = y;
        sprite.setPosition(x, y);
    }

    public void moveLeft(float delta){
        bottom.x -= (100 * delta);
        sprite.setPosition(bottom.x, bottom.y);
    }

    public void moveRight(float delta){
        bottom.x += (100 * delta);
        sprite.setPosition(bottom.x, bottom.y);
    }

    public void jump(){
        velocityY = 10;
    }

    public void draw(SpriteBatch batch){
        sprite.draw(batch);

    }
}
