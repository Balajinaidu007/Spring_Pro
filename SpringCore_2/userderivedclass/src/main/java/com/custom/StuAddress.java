package com.custom;

public class StuAddress {
    private String streetName;
    private String colonyName;
    private int pinCode;
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getColonyName() {
        return colonyName;
    }
    public void setColonyName(String colonyName) {
        this.colonyName = colonyName;
    }
    public int getPinCode() {
        return pinCode;
    }
    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    @Override
    public String toString() {
        return "StuAddress [streetName=" + streetName + ", colonyName=" + colonyName + ", pinCode=" + pinCode + "]";
    }
    public StuAddress(String streetName, String colonyName, int pinCode) {
        this.streetName = streetName;
        this.colonyName = colonyName;
        this.pinCode = pinCode;
    }
    public StuAddress() {
    }


    
}
