package com.leotoneo.liteweather.liteweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by leozhang on 10/6/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
