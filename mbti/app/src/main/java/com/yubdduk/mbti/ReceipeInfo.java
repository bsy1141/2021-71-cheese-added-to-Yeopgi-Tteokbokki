package com.yubdduk.mbti;

import android.widget.ImageView;

public class ReceipeInfo {
    private String name;
    private String receipe;
    private String nation;

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String level;
    private String time;
    private int img;
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

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
