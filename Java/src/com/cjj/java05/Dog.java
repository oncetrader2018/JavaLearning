package com.cjj.java05;


//封装，保持数据的规范


public class Dog {

    String name;
    int age;
    String color;

    public Dog(){

    }

    public Dog(String name,int age,String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public void eat(){
        System.out.println("eating...");
    }

    public void play(){
        System.out.println("playing...");
    }

    public void show(){
        System.out.println("show...");
    }
}
