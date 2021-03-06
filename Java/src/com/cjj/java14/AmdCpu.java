package com.cjj.java14;

public class AmdCpu implements CPU{
    @Override
    public String getBrand() {
        return "Amd";
    }

    @Override
    public String getHZ() {
        return "1000HZ";
    }
}
