package com.yubdduk.mbti;

import android.widget.ImageView;

public class ReceipeInfo {
    private String name;
    private String receipe;
    private String imgsrc;

    public ReceipeInfo(String name, String imgsrc){
        this.name = name;
        this.imgsrc = imgsrc;
    }

    //public ReceipeInfo(String name){
    //    this.name = name;
    //}

    public String getName() {
        return name;
    }

    public String getReceipe() {
        return receipe;
    }

    public String getImgsrc() {
        return imgsrc;
    }

}
