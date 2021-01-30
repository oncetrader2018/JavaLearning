package com.cjj.java04;

public class Point {

    int x;
    int y;

    //设置坐标点的方法
    public void set(int xx,int yy){
        x = xx;
        y = yy;
    }

    //求两点间距离的方法
    public double calDistance(Point p){
        return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));

    }

    //交换两个坐标的方法
    public void changePoint(Point p){
        int a = p.x;
        p.x = x;
        x = a;

        int b = p.y;
        p.y = y;
        y = b;
    }

    //输出坐标的方法
    public void show(){
        System.out.println("["+x+","+y+"]");
    }

    public static void main(String[] args) {
        Point p1 = new Point();
        p1.set(3,4);
        Point p2 = new Point();
        p2.set(0,0);

        System.out.println(p1.calDistance(p2));

        p1.show();

        Point p3 = new Point();
        p3.set(7,8);
        p3.show();

        p1.changePoint(p3);

        p1.show();;
        p3.show();

    }
}
