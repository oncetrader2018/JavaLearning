package com.cjj.java13;

public class PrintMechine implements InkBox,Paper{

    @Override
    public void getWriteAndBlock() {
        System.out.println("使用黑白墨盒");
    }

    @Override
    public void getColor() {
        System.out.println("使用彩色墨盒");
    }

    @Override
    public void getA4() {
        System.out.println("使用A4纸");
    }

    @Override
    public void getB5() {
        System.out.println("使用B5纸");
    }
}
