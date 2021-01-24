package com.cjj;

public class NinenineTable {
    //九九乘法表
    public static void main(String[] args) {
        //左下
        for (int i = 1; i<10; i++){
            for (int j =1; j<=i; j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

        //左上
        for (int i = 9; i>0; i--){
            for (int j =1; j<=i; j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }

        //右上
        for (int i = 9; i>0; i--){
            for (int j =0; j<9-i; j++){
                System.out.print("\t\t");
            }

            for (int k =i; k>0; k--){
                System.out.print(i+"*"+k+"="+i*k+"\t");
            }
            System.out.println();
        }

        //右下
        for (int i = 1; i<10; i++){
            for (int j =0; j<9-i; j++){
                System.out.print("\t\t");
            }
            for (int k =i; k>0; k--){
                System.out.print(i+"*"+k+"="+i*k+"\t");
            }
            System.out.println();
        }

        //居中
        for (int i = 9; i>0; i--){
            for (int j =0; j<9-i; j++){
                System.out.print("\t");
            }

            for (int k =i; k>0; k--){
                System.out.print(i+"*"+k+"="+i*k+"\t");
            }
            System.out.println();
        }
    }
}
