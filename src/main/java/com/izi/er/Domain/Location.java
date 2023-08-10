package com.izi.er.Domain;

public class Location {
    private Double Latitude;
    private Double Longtitude;

    public Location(Double Latitude,Double Longtitude){
        this.Latitude = Latitude;
        this.Longtitude = Longtitude;
    }

    public Double getLatitude() {
        return Latitude;
    }

    public void setLatitude(Double latitude) {
        Latitude = latitude;
    }

    public Double getLongtitude() {
        return Longtitude;
    }

    public void setLongtitude(Double longtitude) {
        Longtitude = longtitude;
    }





}
