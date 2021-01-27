package com.cjj.java03;
//Java文件中可以定义多个类,但只有有一个public class和它的类名和文件名同名


public class Student {
        int stuNumber;
        String name;
        int age = 20;

        //方法的定义
        void study(){
            System.out.println("面向对象学习中");
        }

        void eat(String food){
            System.out.println("我在吃"+food);
        }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);

        student.name = "张全";
        student.age = 20;
        student.stuNumber = 2209871;

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.stuNumber);

        student.study();
        student.eat("apple");

    }
}

class Teacher{


}

