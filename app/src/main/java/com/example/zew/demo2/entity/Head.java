package com.example.zew.demo2.entity;

import android.support.annotation.NonNull;

/**
 * Created by zew on 17/2/14.
 */
public class Head {
    @NonNull  public  String song;
    public int icon;
    public Head(@NonNull String song,int icon) {
        this.song = song;
        this.icon=icon;
    }
}
