package com.spring.IoC;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 张文旭 on 2019/3/4.
 */
public class Boss {
    private  String name;
    private String company;
    private  Car car;
    private List<String> hobby ;

    public Boss(){}
    public Boss(String name, String company, Car car, List<String> hobby) {
        this.name = name;
        this.company = company;
        this.car = car;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", car=" + car +
                ", hobby=" + hobby +
                '}';
    }
}
