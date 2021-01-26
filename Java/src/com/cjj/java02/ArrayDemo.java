package com.cjj.java02;

import java.lang.reflect.Array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array;
        array = new int[5];
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;
        array[3] = 3;
        array[4] = 4;

        System.out.println(array[4]);

        int[] arr1 = new int[5];
        int [] arr2 = new int[5];
        int arr3[]  = new int[5];

        int[] arr4 = new int[]{1,2,3,4,5};
        int[] arr5 = {1,2,3};

        System.out.println(arr5.length);

        int[] arr6 = new int[]{56,66,77,88};
        int sum = 0;
        for (int i = 0; i<arr6.length;i++){
            sum += arr6[i];
        }
        System.out.println("平均值："+sum/arr6.length);
        //java 递归算法、数组讲解、排序算法

    }
}
