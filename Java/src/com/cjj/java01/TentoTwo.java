package com.cjj.java01;

import java.util.Scanner;
//使用循环分别实现将10进制整数变成二进制数
public class TentoTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int number = sc.nextInt();
        String str = "";
        String str2 = "";

        while (number != 0){
            int i = number % 2;
            str = i + str; //倒序
            str2 = str2 + i; //正序
            number = number/2;
        }
        System.out.println(str);
        System.out.println(str2);
    }
}
