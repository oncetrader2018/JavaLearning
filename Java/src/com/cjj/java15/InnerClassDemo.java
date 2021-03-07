package com.cjj.java15;

public class InnerClassDemo {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("show");

        //外部类不能访问内部类的属性值
        //System.out.println(age);

        //通过new对象来访问内部
        InnerClass inner = new InnerClass();
        System.out.println(inner.age);
    }

    class InnerClass{
        private int age;

        //内部类不能写static常量
        //static String name = "jjjj";

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void test(){
            System.out.println("test");
            //内部类可以访问外部类的属性
            System.out.println(id);
            System.out.println(name);
        }
    }

}
