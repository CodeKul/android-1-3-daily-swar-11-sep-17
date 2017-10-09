package com.codekul.listview;

/**
 * Created by aniruddha on 9/10/17.
 */

public class CustItm {

    private int imgId;
    private String txt;

    public CustItm(int imgId, String txt) {
        this.imgId = imgId;
        this.txt = txt;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }
}
