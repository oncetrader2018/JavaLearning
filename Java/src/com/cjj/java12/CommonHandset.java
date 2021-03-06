package com.cjj.java12;

public class CommonHandset extends Handset implements PlayWiring{

    public CommonHandset() {
    }

    public CommonHandset(String brand, String type) {
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
    public void pay() {
        System.out.println("播放能力");
    }
}
