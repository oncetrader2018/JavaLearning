package com.cjj.java04;

//构造方法创建对象
//有参考构造方法
//无参构造方法

public class Teacher {

    String name;
    int age;

    //无参构造方法,不能加void,且能调用return
    public Teacher(){
        System.out.println("无参构造方法");

    }

    //有参构造方法
    public Teacher(String xname,int xage){
        System.out.println("有参构造方法");
        name = xname;
        age = xage;
    }

    //有参构造方法，重载
    public Teacher(int xage,String xname){
        System.out.println("有参构造方法，重载");
        name = xname;
        age = xage;
    }

    public void teach(){
        System.out.println("上课");
    }

    public static void main(String[] args) {
        Teacher teach = new Teacher();
        //默认值，由构造方法默认创建
        System.out.println(teach.age);
        System.out.println(teach.name);

        Teacher teach2 = new Teacher("chen",28);
        System.out.println(teach2.age);
        System.out.println(teach2.name);

        Teacher teach3 = new Teacher(29,"Felix");
        System.out.println(teach3.age);
        System.out.println(teach3.name);
    }
}
