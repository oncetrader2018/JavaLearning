package com.cjj.java11;

public class Mouse implements Usb {

    @Override
    public void dataTransfer() {
        System.out.println("鼠标来点击屏幕 ");
    }
}
