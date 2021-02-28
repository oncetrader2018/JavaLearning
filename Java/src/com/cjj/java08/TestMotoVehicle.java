package com.cjj.java08;

public class TestMotoVehicle {
    public static void main(String[] args) {
        //抽象类不能实例化！
        //MotoVehicle moto = new MotoVehicle();
        Car car = new Car(1234,"宝马","1");
        System.out.println("租金是："+ car.calcRent(5));

        Bus bus = new Bus(4567,"金龙",20);
        System.out.printf("租金是："+ bus.calcRent(5));

    }
}
