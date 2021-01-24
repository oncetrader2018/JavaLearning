package com.cjj.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String details = "";
        int balance = 0;

        while (true){
            System.out.println("-----欢迎小鲨鱼记账软件系统-----");
            System.out.println("1、收支明细");
            System.out.println("2、登记收入");
            System.out.println("3、登记支出");
            System.out.println("4、退   出");
            System.out.println("请选择以下功能");
            Scanner sc = new Scanner(System.in);
            int choise = sc.nextInt();

            while (choise!=1 && choise!=2 && choise!=3 & choise!=4){
                System.out.println("输入功能有误，请重新输入！");
                int newChoise = sc.nextInt();
                choise = newChoise;
            }

            switch (choise){
                case 1:
                    System.out.println("记账系统---->收支明细：");
                    if (details!=""){
                        System.out.println(details.substring(0,details.length()-1));
                    }else {
                        System.out.print(details);
                    }
                    break;
                case 2:
                    System.out.println("记账系统---->登记收入：");
                    System.out.println("请输入收入金额：");
                    int income = sc.nextInt();
                    System.out.println("请输入收入说明：");
                    String incomeDetail = sc.next();
                    balance += income;
                    details = details + "收入："+income+"\t 收入说明："+incomeDetail+"\t 帐户余额："+balance+"\n";
                    break;
                case 3:
                    System.out.println("记账系统---->登记支出：");
                    System.out.println("请输入支出金额：");
                    int expend = sc.nextInt();
                    System.out.println("请输入支出说明：");
                    String expendDetail = sc.next();
                    balance -= expend;
                    details = details + "支出："+expend+"\t 支出说明："+expendDetail+"\t 帐户余额："+balance+"\n";
                    break;
                case 4:
                    System.out.println("记账系统---->退   出");
                    System.out.println("确定要退出吗？ Y/N:");
                    String isExit = sc.next();
                    switch (isExit){
                            case "Y":
                                System.out.println("系统已退出，欢迎下次再使用");
                                return;
                    }
                    //return;
            }

        }
    }
}
