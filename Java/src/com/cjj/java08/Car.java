package com.cjj.java08;

//轿车
//私有属性：车型


//创建类时考虑：1、属性，2，构造方法，3，getter and setter, 4,其他普通方法、重写方法

public class Car extends MotoVehicle{
    private String type;

    public Car(){

    }
    public Car(String type) {
        this.type = type;
    }

    public Car (int no,String brand,String type){
        super(no,brand);//给子类调用no,brand,所以父类在写上构造方法才能用super，但并不意味抽象类能实例化
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int calcRent(int day) {
        if(type.equals("0")){
            return 600*day;
        }else if (type.equals("1")){
            return 500*day;
        }else if (type.equals("2")){
            return 300*day;
        }else {
            System.out.println("类型不匹配！");
            return 0;
        }
    }
}
