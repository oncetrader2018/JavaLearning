package com.cjj.java03;

import javax.swing.text.Style;
import java.util.Scanner;

public class Administrator {

    String loginName = "admin";
    String passWord = "123456";

    //小写方法名？
    public void introduce(){
        System.out.println(loginName);
        System.out.println(passWord);
    }

    public static void main(String[] args) {
        Administrator admin = new Administrator();
        System.out.println(admin.loginName);
        System.out.println(admin.passWord);

        admin.introduce();

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("修改密码");
            System.out.println("请输入用户名：");
            String name = sc.nextLine();
            System.out.println("请输入密码：");
            String pwd = sc.nextLine();

            //字符串比较
            if (name.equals(admin.loginName) && pwd.equals(admin.passWord)){

                System.out.println("请输入新的用户名：");
                admin.loginName = sc.nextLine();
                System.out.println("请输入新的密码：");
                admin.passWord = sc.nextLine();
                System.out.println("修改成功！");
                break;
            }else {
                System.out.println("用户名和密码不正确，请重新输入");
            }
        }

        admin.introduce();


    }

}
