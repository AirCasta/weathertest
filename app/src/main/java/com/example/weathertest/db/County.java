package com.example.weathertest.db;

import org.litepal.crud.DataSupport;

/**
 * Created by AirCasta on 2017/5/15.
 */

public class County extends DataSupport {
    private int Id;
    private String countyName;
    private int weatherId;
    private int cityId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
