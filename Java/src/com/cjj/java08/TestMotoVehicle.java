package com.cjj.java08;

public class TestMotoVehicle {
    public static void main(String[] args) {
        //抽象类不能实例化！
        //MotoVehicle moto = new MotoVehicle();
        Car car = new Car(1234, "宝马", "1");
        System.out.println("租金是：" + car.calcRent(5));

        Bus bus = new Bus(4567, "金龙", 20);
        System.out.println("租金是：" + bus.calcRent(5));


        //多态改写
        MotoVehicle[] moto = new MotoVehicle[5];
        moto[0] = new Car(1, "宝马", "1");
        moto[1] = new Car(1, "宝马", "1");
        moto[2] = new Car(2, "别克", "2");
        moto[3] = new Bus(3, "金龙", 34);
        moto[4] = new Track(4,"hh",50);

        int totalMoney = calcTotal(moto);
        System.out.println("总租金："+totalMoney);
    }

    public static int calcTotal(MotoVehicle[] moto){
            int totalMoney = 0;
            for (int i = 0;i < moto.length; i++){
                totalMoney += moto[i].calcRent(5);
            }
            return totalMoney;
        }
}
