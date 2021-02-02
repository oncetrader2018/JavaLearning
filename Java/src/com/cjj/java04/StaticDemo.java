package com.cjj.java04;

//普通变量在使用的时候，必须通过对象来调用
//而类变量或静态变量可以使用对象名调用或类名调用

public class StaticDemo {

    String name = "chen";
    static int age = 10;//类变量

    public static void main(String[] args) {
        StaticDemo sd = new StaticDemo();
        //使用对象进行调用
        System.out.println(sd.name);
        System.out.println(sd.age);

        sd.age = 20;
        System.out.println(sd.age);
        System.out.println(StaticDemo.age);

        StaticDemo.age = 30;
        System.out.println(sd.age);
        System.out.println(StaticDemo.age);

        StaticDemo sd1 = new StaticDemo();
        System.out.println(sd1.age);

        //使用类名调用
        System.out.println(StaticDemo.age);

    }
}
