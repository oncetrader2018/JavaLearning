package com.cjj.java04;


//package 包，写的第一行
//解决重名的总是
//命名 package 域名的倒写

//lang:自动导入

//import java.包名.类名，建立导入具体包
//完全限定导入
//静态导包  import static java.lang.Math.*


import java.util.Date;
import static java.lang.Math.*;

public class PackageDemo {
    public static void main(String[] args) {
        java.util.Date date = new java.util.Date();
        Date date1 = new Date();


        System.out.println(Math.sqrt(5));
        //表态导包
        System.out.println(sqrt(5));

    }

}
