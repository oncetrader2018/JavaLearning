package com.cjj.java03;

import java.util.Scanner;

public class StringDemo {

    public static void main(String[] args) {
        String str = "abc";
        String str2 = str;
        System.out.println(str == str2);
        System.out.println(str.equals(str2));


        Scanner sc = new Scanner(System.in);
        String str3 = sc.nextLine();
        System.out.println(str == str3);
        System.out.println(str.equals(str3));


        String str4 = new String("abc");
        System.out.println(str == str4);
        System.out.println(str.equals(str4));

    }
}
