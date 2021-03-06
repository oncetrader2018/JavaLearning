package com.cjj.java08;

//多态：不同对象调用同一个方法的不同反应。或同一个引用类型，使用不同的实例而执行不同操作
//1、必须有继承关系，2、子类的方法必须重写父类的方法，3、父类引用指向子类对象

//多态的作用和目的：扩展性强和维护性强；方便代码逻辑编写

//思路：先写父类，再写子类，在子类中重写父类的方法，然后在使用时就使用父类的类型，子类的对象，这时会自动类型转换


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
