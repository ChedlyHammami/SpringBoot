package com.wimbee.iocdi.models;

public interface IAddress {
    void setNumber(int number);
    void setStreet(String street);
    void setDistrict(String district);
    String toString();
}