package com.cjj.java08;

//抽象对象，父类
//共有属性：车牌号、品牌

//创建类时考虑：1、属性，2，构造方法，3，getter and setter, 4,其他普通方法

public abstract class MotoVehicle {
    private int no;
    private String brand;

    //即抽象类里是可以写构造方法的，但不能new 对象
    public MotoVehicle(){

    }

    public MotoVehicle(int no,String brand){
        this.no = no;
        this.brand = brand;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract int calcRent(int day);

}
