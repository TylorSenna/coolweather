package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by VM510L on 2017/9/14.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temprature;

    @SerializedName("cond")
    public More more;

    public class Temperature{

        public String max;

        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String info;
    }
}
