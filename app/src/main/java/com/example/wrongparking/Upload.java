package com.example.wrongparking;

public class Upload {
    private String mName;
    private String mImageUrl;
    private String mValstnum;
    private long mTime;
    private boolean mPatvirtintas;
    private boolean mPerziuretas;

    public Upload() {
        //empty constructor needed
    }

    public Upload(String name, String valstnum, String imageUrl, long dateTime, boolean patvirtintas, boolean perziuretas) {


        mName = name;
        mImageUrl = imageUrl;
        mValstnum = valstnum;
        mTime = dateTime;
        mPatvirtintas = patvirtintas;
        mPerziuretas = perziuretas;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }


    public String getValstnum() {
        return mValstnum;
    }

    public void setValstnum(String valstnum) {
        mValstnum = valstnum;
    }


    public long getTime() {
        return mTime;
    }

    public void setTime(long dateTime) {
        mTime = dateTime;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }


    public boolean isPatvirtintas() {
        return mPatvirtintas;
    }

    public void setPatvirtintas(boolean mPatvirtintas) {
        this.mPatvirtintas = mPatvirtintas;
    }

    public boolean isPerziuretas() {
        return mPerziuretas;
    }

    public void setPerziuretas(boolean mPerziuretas) {
        this.mPerziuretas = mPerziuretas;
    }
}
