package com.example.xiaoma_weather.db;

import org.litepal.crud.LitePalSupport;

public class County extends LitePalSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getcountyName() {
        return countyName;
    }
    public void setcountyName(String countyName) {
        this.countyName = countyName;
    }
    public int gecityId() {
        return cityId;
    }
    public void secityId(int cityId) {
        this.cityId =cityId;
    }
    public String getWeatherId()
    {
        return weatherId;
    }
    public void setWeatherId(String weatherId)
    {
        this.weatherId=weatherId;
    }

}
