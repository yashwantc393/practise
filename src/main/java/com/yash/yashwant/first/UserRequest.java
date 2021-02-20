package com.yash.yashwant.first;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserRequest {

    private int id;
    private String firstName;
    private String lastName;
    @JsonProperty("age")
    private int ageYear;
    private Address currentAddress;
    private Address permanentAddress;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAgeYear() {
        return ageYear;
    }

    public void setAgeYear(int ageYear) {
        this.ageYear = ageYear;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
                "id" + id +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ageYear=" + ageYear +
                ", currentAddress=" + currentAddress +
                ", permanentAddress=" + permanentAddress +
                '}';
    }
}