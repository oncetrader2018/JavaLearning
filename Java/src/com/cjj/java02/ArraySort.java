package com.cjj.java02;

public class ArraySort {

    public static void main(String[] args) {
        int[] array = new int[]{4,1,2,5,7,9,5,3,8};
        //冒泡算法
        for (int i = 0; i<array.length;i++){
            for (int j =0; j<array.length-1-i;j++){
                if (array[j] < array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]+"\t");
        }


        //不引用第三者的数据交换
        int a = 1;
        int b = 2;
        System.out.println("a:"+a+"\t"+"b:"+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a:"+a+"\t"+"b:"+b);

        //选择排序
        //int[] array = new int[]{4,1,2,5,7,9,5,3,8};
        for (int i = 0; i<array.length;i++){
            for (int j = i+1;j<array.length;j++){
                if (array[i] <  array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]+"\t");
        }



    }
}
