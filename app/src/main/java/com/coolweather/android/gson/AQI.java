package com.coolweather.android.gson;

/**
 * Created by Shaw on 2017/3/12.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
