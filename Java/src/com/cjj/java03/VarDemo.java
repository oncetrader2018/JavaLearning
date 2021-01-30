package com.cjj.java03;

//局部变量--->栈，Stack,先进后出，FILO
//成员变量--->堆，Heap, new CCCC()，垃圾清理
//方法区，method area,类的信息(代码)，static变量，字符串

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
