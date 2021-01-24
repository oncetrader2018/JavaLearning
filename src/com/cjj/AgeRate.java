package com.cjj;

import java.util.Scanner;

public class AgeRate {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ageUp = 0;
        int ageDown = 0;

        for (int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"位的年龄：");
            int age = (int)sc.nextInt();
            if (age<30){
                ageUp++;
            }else {
                ageDown++;
            }
        }
        System.out.println("大于30岁的占比是：" +ageUp/10.0*100+"%");
        System.out.println("小于30岁的占比是：" +ageDown/10.0*100+"%");

    }
}
