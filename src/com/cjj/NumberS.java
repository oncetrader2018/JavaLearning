package com.cjj;

public class NumberS {
    //阶乘之和
    public static void main(String[] args) {
        int sum = 1;
        int total = 0;
        for (int i = 1; i <= 10; i++){
            sum *= i;
            total += sum;
        }
        System.out.println(total);
    }
}
