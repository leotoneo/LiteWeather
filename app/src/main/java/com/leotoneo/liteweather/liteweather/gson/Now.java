package com.leotoneo.liteweather.liteweather.gson;

import android.test.MoreAsserts;

import com.google.gson.annotations.SerializedName;

/**
 * Created by leozhang on 10/6/17.
 */

public class Now {
    @SerializedName("temp")
    public String temperture;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
