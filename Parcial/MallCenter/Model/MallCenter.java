package com.Parcial.MallCenter.Model;

import java.io.Serializable;

public class MallCenter implements Serializable {
    public Integer Id;
    private String name;
    private String city;
    private String address;
    public MallCenter(Integer id, String name, String city, String address) {
        Id = id;
        this.name = name;
        this.city = city;
        this.address = address;
    }
    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "MallCenter [Id=" + Id + ", name=" + name + ", city=" + city + ", address=" + address + "]";
    }
}
