package com.reepa.domain;

/**
 * Created by reepa on 20-06-2016.
 */
public class Weather {

    private String temp;
    private String description;
    private Location location;

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
