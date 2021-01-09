package com.yubdduk.mbti;

import android.widget.ImageView;

public class ReceipeInfo {
    private String name;
    private String receipe;
    private int img;

    public ReceipeInfo(String name, int img){
        this.name = name;
        this.img = img;
    }

    public ReceipeInfo(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getReceipe() {
        return receipe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReceipe(String receipe) {
        this.receipe = receipe;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
