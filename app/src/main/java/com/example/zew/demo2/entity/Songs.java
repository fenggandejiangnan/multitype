package com.example.zew.demo2.entity;

import android.support.annotation.NonNull;

/**
 * Created by zew on 17/2/14.
 */
public  class Songs {
    @NonNull  public  String song;
    public int icon;
    public Songs(@NonNull String song,int icon) {
        this.song = song;
        this.icon=icon;
    }
}
