package com.cjj.java17;
/*
包装类与基本类数据类型
拆箱、装箱的过程

 */
public class IntegerDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer i = new Integer(10);

        Integer i3 = Integer.valueOf(a);
        int i4 = i.intValue();

        System.out.println( a == i);

        Integer i11 = 200;
        Integer i22 = 200;
        Integer i33 = 100;
        Integer i44 = 100;

        System.out.println(i11 == i22);
        System.out.println(i33 == i44);

    }
}
