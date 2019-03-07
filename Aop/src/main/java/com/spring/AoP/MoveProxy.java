package com.spring.AoP;

/**
 * Created by 张文旭 on 2019/3/7.
 */
public class MoveProxy implements Move {
    //声明一个Move接口的对象
    private Move t;

    public MoveProxy(Move t) {
        this.t = t;
    }

    @Override
    public void move() {

        System.out.println("start");
        t.move();
        System.out.println("Stop");

    }
}
