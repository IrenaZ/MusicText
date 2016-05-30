package com.example.re3.musictext;


import android.graphics.Bitmap;

/**
 * Created by re3 on 27.05.16.
 */
public class Music {


    private String name; // название

    private Bitmap album_pic; // ресурс
    private String path; //путь



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getAlbum_pic() {
        return album_pic;
    }

    public void setAlbumpic(Bitmap album_pic) {
        this.album_pic = album_pic;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
