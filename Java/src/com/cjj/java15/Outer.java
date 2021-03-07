package com.cjj.java15;

public class Outer {
    private String name = "外部类属性";

    class Inner{
        private String name = "内部类属性";

        public void show(){
            System.out.println(name);
            System.out.println(this.name);
            System.out.println(Inner.this.name);

            System.out.println(Outer.this.name);
        }
    }

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
