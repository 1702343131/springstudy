package com.spring.IoC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 张文旭 on 2019/3/4.
 */
public class Meeting {
    private  String theme;
    private List<Boss> bosses;

    public Meeting(){

    }
    public Meeting(String theme, List<Boss> bosses) {
        this.theme = theme;
        this.bosses = bosses;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public List<Boss> getBosses() {
        return bosses;
    }

    public void setBosses(List<Boss> bosses) {
        this.bosses = bosses;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", bosses=" + bosses +
                '}' ;
    }
}
