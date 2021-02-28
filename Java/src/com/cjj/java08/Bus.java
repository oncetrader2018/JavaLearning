package com.cjj.java08;

//客车(金杯、金龙)
//私有属性：座数

//创建类时考虑：1、属性，2，构造方法，3，getter and setter, 4,其他普通方法、重写方法

public class Bus extends MotoVehicle{
    private int seatcount;

    public Bus(){

    }

    public Bus(int no, String brand, int seatcount){
        super(no,brand);
        this.seatcount = seatcount;
    }

    public int getSeatcount() {
        return seatcount;
    }

    public void setSeatcount(int seatcount) {
        this.seatcount = seatcount;
    }

    @Override
    public int calcRent(int day) {
        if(seatcount > 16){
            return 1500 * day;
        }else {
            return 800 * day;
        }
    }
}
