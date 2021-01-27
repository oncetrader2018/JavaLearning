package com.cjj.java01;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {

//        int i = 1;
//        while (i < 100){
//            System.out.println(i+",Java");
//            i++;
//        }
        //100以内的和
//        int i = 1;
//        int sun = 0;
//        while (i <=100){
//            if (i % 2 == 0){
//                sun+=i;
//            }
//            i++;
//        }
//        System.out.println(sun);
//
        System.out.println("请选择所要购买的商品：");
        System.out.println("1、苹果"+"    "+"2、草莓"+"    "+"3、香蕉");
        Scanner sc = new Scanner(System.in);
        int chiose = sc.nextInt();

        System.out.println("请输入购买数量：");
        Scanner sc2 = new Scanner(System.in);
        int vol = sc2.nextInt();

        int sum = 0;
        switch (chiose){
            case 1:
                sum = vol * 5;
                System.out.println("苹果的单价为 5元/个");
                System.out.println("合计金额="+sum);
                break;
            case 2:
                sum = vol * 10;
                System.out.println("草莓的单价为 10元/个");
                System.out.println("合计金额="+sum);
                break;
            case 3:
                sum = vol * 15;
                System.out.println("香蕉的单价为 15元/个");
                System.out.println("合计金额="+sum);
                break;
            default:
                System.out.println("您的输入有误，请核对后再试，谢谢！");
        }
    }
}
