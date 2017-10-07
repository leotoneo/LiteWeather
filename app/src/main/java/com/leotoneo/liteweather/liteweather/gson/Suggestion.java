package com.leotoneo.liteweather.liteweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by leozhang on 10/6/17.
 */


public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carwash;

    public Sport sport;

    public class Comfort {
        @SerializedName("txt")
        public String info;

    }

    public class CarWash {

        @SerializedName("txt")
        public String info;
    }

    public class Sport {

        @SerializedName("txt")
        public String info;
    }
}
