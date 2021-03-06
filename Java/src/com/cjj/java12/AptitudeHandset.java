package com.cjj.java12;

public class AptitudeHandset extends Handset implements TakePictures,Network{

    public AptitudeHandset() {
    }

    public AptitudeHandset(String brand, String type) {
        super(brand, type);
    }

    @Override
    public void sendInfo() {
        System.out.println("发送信息能力");
    }

    @Override
    public void call() {
        System.out.println("打电话能力");
    }

    @Override
    public void info() {
        System.out.println("查看信息能力");
    }

    @Override
    public void netWork() {
        System.out.println("上网能力");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照能力");
    }

}
