package com.cjj.java09;

//多态：不同对象调用同一个方法的不同反应。或同一个引用类型，使用不同的实例而执行不同操作
//1、必须有继承关系，2、子类的方法必须重写父类的方法，3、父类引用指向子类对象

//多态的作用和目的：扩展性强和维护性强；方便代码逻辑编写

//思路：先写父类，再写子类，在子类中重写父类的方法，然后在使用时就使用父类的类型，子类的对象，这时会自动类型转换

import com.cjj.java08.Car;

public class Person1 {

/*
    //feed 方法重复，需要抽象和封装它
    public void feed(Cat cat){
        cat.feed();
    }

    public void feed(Dog dog){
        dog.feed();
    }
*/

    //----写它的父类，dog和cat的父类都是Pet
    //父类作为方法的参数
    public void feed(Pet pet){
        pet.feed();
    }

    //父类作为方法的返回值类型
    public Pet buyPet(int type){
        if(type == 1){
            return new Dog();
        }else if(type == 2){
            return new Cat();
        }else{
            return new Pig();
        }
    }

    public static void main(String[] args) {
        Person1 p = new Person1();
//        Dog dog = new Dog();
//        Cat cat = new Cat();

        //父类引用指向子类对象
        Pet dog = new Dog();
        Pet cat = new Cat();
        //再养个猪
        Pet pig = new Pig();

        p.feed(dog);
        p.feed(cat);
        //再去喂猪
        p.feed(pig);


        Pet pet = p.buyPet(1);
        if(pet instanceof Dog){
            System.out.println("买了狗");
        }else if (pet instanceof Cat){
            System.out.println("买了猫");
        }else {
            System.out.println("买了猪");
        }
    }
}
