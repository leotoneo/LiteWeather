package com.leotoneo.liteweather.liteweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by leozhang on 10/6/17.
 */

public class Forecast {

    public String date;

    @SerializedName("temp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("txt_d")
        public String info;
    }
}
