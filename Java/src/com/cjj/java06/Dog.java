package com.cjj.java06;

public class Dog extends Pet{
    //私有属性
//    private String name;
//    private int age;
//    private String gender;
    private String sound;

    //构造方法
    public Dog(){}

    public Dog(String name, int age, String gender, String sound) {
        super(name,age,gender);
        this.sound = sound;
    }


    //get and set
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getId() {
//        return age;
//    }
//
//    public void setId(int age) {
//        this.age = age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
