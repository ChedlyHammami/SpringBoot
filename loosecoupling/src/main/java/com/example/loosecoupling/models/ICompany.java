package com.example.loosecoupling.models;

public interface ICompany {
    void setAddress(IAddress address);
    void setName(String name);
    String toString();
    String getName();
    IAddress getAddress();
}