package com.spring.IoC;

import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 张文旭 on 2019/3/4.
 */
public class Boss {
   private String name;
   private Car car;
   private  String company;
   private  List<String> hobbies;
   public Boss(){

   }

    public Boss(String name, Car car, String company, List<String> hobbies) {
        this.name = name;
        this.car = car;
        this.company = company;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", company='" + company + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
