package com.yash.yashwant.first;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {

    private String houseNo;
    @JsonProperty("street")
    private String streetName;
    private String city;
    private int pincode;
    private String state;

    public String getHouseNo() {
        return  houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNo='" + houseNo + '\'' +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                ", state='" + state + '\'' +
                '}';
    }
}
