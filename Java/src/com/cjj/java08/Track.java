package com.cjj.java08;

public class Track extends MotoVehicle{
    private int weight;

    public Track(){

    }

    public Track(int no, String brand, int weight){
        super(no,brand);
        this.weight = weight;
    }

    @Override
    public int calcRent(int day) {
        return 50*day*this.weight;
    }
}
