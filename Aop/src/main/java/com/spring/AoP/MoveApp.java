package com.spring.AoP;

/**
 * Created by 张文旭 on 2019/3/7.
 */
public class MoveApp {
    public static void main(String[] args) {
        Move t = new Tank();
        Move moveproxy = new MoveProxy(t);
        t.move();
    }

}
