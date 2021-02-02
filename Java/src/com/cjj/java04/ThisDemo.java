package com.cjj.java04;

//this表示当前对象的指针
//指向当前对象，表示当前对象的引用
//当构造方法中的参数名称和类的成员变量一致时，可以使用this代表当前对象
//普通方法中,当多个普通方法之间需要调用的时候，可以使用this进行调用，表示当前的对象的其他方法
//this()

public class ThisDemo {

    String name;
    int age;

    public ThisDemo(String name,int age){
        this.name = name;
        this.age = age;
        System.out.println("ttt");
    }

    public ThisDemo(String name){
        this("jiajian",18);
        this.name = name;
    }

    public void test1(){
        System.out.println("test1");
    }

    public void test2(){
        test1();
        System.out.println("test2");
    }

    public void test3(String name){
        System.out.println(name);
        System.out.println(this.name);

    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo("chen");
        System.out.println(td.age);
        System.out.println(td.name);

        td.test1();
        td.test2();


        td.test3("Feifei");

    }


}
