package com.cjj.java09;

//多态：不同对象调用同一个方法的不同反应。
//1、必须有继承关系，2、子类的方法必须重写父类的方法，3、父类引用指向子类对象

//扩展性强

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
    public void feed(Pet pet){
        pet.feed();
    }

    public static void main(String[] args) {
        Person1 p = new Person1();
//        Dog dog = new Dog();
//        Cat cat = new Cat();

        Pet dog = new Dog();
        Pet cat = new Cat();
        //再养个猪
        Pet pig = new Pig();

        p.feed(dog);
        p.feed(cat);
        //再去喂猪
        p.feed(pig);
    }
}
