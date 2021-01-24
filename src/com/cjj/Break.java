package com.cjj;

public class Break {
    //生成0-100随机数，当生成到88时停，打印生成的次数
    public static void main(String[] args) {
        /*------
        int count = 0;
        while (true){
            int i = (int)(Math.random()*101);
            if (i == 88){
                break;
            }
            count++;
            System.out.println(count+"--"+i);
        }
        */

        /*--------
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++) {
                System.out.println("(" + i + "," + j + ")");
                if (i == 6 && j == 6) {
                    //break;
                    return;
                }
            }
        }

         */

        for (int i = 100; i <= 150; i++){
            if (i % 3 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
