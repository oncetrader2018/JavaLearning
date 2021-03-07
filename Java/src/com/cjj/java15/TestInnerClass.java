package com.cjj.java15;

//内部类：匿名内部类、静态内部类、方法内部类

public class TestInnerClass {
    public static void main(String[] args) {
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        innerClassDemo.show();
        System.out.println(innerClassDemo.getName());

        //内部类的实例化方式
        InnerClassDemo.InnerClass innerClass = new InnerClassDemo().new InnerClass();
        innerClass.test();



    }
}
