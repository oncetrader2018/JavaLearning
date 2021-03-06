package com.cjj.java14;

public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        CPU cpu = new AmdCpu();
        computer.show(cpu);
    }
}
