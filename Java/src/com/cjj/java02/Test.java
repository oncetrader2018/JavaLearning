package com.cjj.java02;

public class Test {
    //栈=变量，堆=new对象
    public static void main(String[] args) {
        int[] s = null;
        s = new int[10];
        for (int i=0; i<10; i++){
            s[i] = 2*i+1;
            System.out.println(s[i]);
        }
    }
}
