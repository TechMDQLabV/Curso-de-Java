package org.sergiogarguir.optional.ejemplo.models;

public class Address {
    private String streetName;
    private String streetNumber;
    private String cityName;

    public Address() {
    }

    public Address(String streetName, String streetNumber, String cityName) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.cityName = cityName;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
