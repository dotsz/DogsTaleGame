package com.mygdx.dogstale;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class Utils {
    public static FileHandle getClasspath(String filepath){
        return Gdx.files.classpath(filepath);
    }

    public static FileHandle getInternal(String filepath){
        return Gdx.files.internal(filepath);
    }

    public static FileHandle getLocal(String filepath){
        return Gdx.files.local(filepath);
    }

    public static FileHandle getExternal(String filepath){
        return Gdx.files.external(filepath);
    }
}
