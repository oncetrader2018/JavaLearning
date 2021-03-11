package com.cjj.java16;

//异常处理：try，

import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("kkk");
        try{
            System.out.println("请输入被除数：");
            int num1 = in.nextInt();
            System.out.println("请输入除数：");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",num1,num2,num1/num2));
        }catch (Exception e){
            System.out.println("出现异常！");

            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e);

        }
        System.out.println("感谢使用本程序！");
    }
}
