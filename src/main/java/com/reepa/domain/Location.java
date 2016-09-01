package com.reepa.domain;

import javax.persistence.Entity;

/**
 * Created by reepa on 20-06-2016.
 */

public class Location {

    private String city;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
