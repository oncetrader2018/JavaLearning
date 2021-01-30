package com.cjj.java03;

//局部变量--->栈
//成员变量--->堆

/*
成员变量有默认值，局部变量没有默认值
 */

public class VarDemo {

    int age = 20;
    static int sage = 50;
    public void show(){
        int a = 10;
        String name = "cjj";
        System.out.println(age);
        System.out.println(sage);
    }

    public static void main(String[] args) {
        VarDemo vd = new VarDemo();
        vd.show();

        //System.out.println(age);//不能访问
        System.out.println(sage);

    }
}
