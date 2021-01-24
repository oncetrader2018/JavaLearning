package com.cjj;

public class FibNumber {
    //fibo数列
    //0,1,1,2,3,5,8,13,21
    public static void main(String[] args) {
        System.out.println(Fib(7));
    }

    private static int Fib(int n) {
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return Fib(n-1) + Fib(n-2);
    }
}
