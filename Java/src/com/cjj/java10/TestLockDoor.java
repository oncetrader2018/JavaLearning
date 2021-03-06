package com.cjj.java10;

//接口代表一种能力,接口中可以定义N多个方法，子类在进行实现的时候，必须要实现这些方法，将这些方法进行实现，就意味着具体了方法的能力
//关心实现类有能力，不关心实现的细节

//接口是一种约定

//java中的继承是单继承的，如果拥有多个父类的时候，可用接口来实现
//interface
//接口中可以包含多个方法，且方法的抽象类中的抽象方法一致，可以不写实现，子类在实现的时候必须要实现
//子类实现接口使用implements

//接口中的方法都是抽象方法，不能包含方法的实现
//public abstract可写可不写， 权限是public
//接口不可以被实例化
//接口的子类必须实现接口中的所有方法，跟抽象类有所不同，抽象类中的抽象方法必须要被子类实现
//子类可以拥有实现多个接口
//接口中的变量都是表态常量,static final
//接口中的方法和常量无论是否写public修饰，默认权限都是public


//什么时候用抽象类(is a)，还是用接口（has a）?

public class TestLockDoor {
    public static void main(String[] args) {
        LockDoor lockDoor = new LockDoor();
        lockDoor.closeDoor();
        lockDoor.openDoor();
        lockDoor.closeLock();
        lockDoor.openLock();

        System.out.println(lockDoor.a);
        System.out.println(lockDoor.b);
    }
}
