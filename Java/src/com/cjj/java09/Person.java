package com.cjj.java09;

public class Person {

    public void feed(){
        new Dog().feed();
        new Cat().feed();
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.feed();
    }
}
