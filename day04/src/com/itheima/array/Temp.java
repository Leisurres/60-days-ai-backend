package com.itheima.array;

import java.util.Random;

public class Temp {
    public static void main(String[] args) {
        // 交换对称位置数据
        int[] arr = { 1, 2, 3, 4, 5 };
        for (int i = 0, j = arr.length - 1; i < j; i++,j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]);
        }

        //打乱数据
        Random r = new Random();

        for(int i = 0; i< arr.length - 1;i++){
            int randomNum = r.nextInt(arr.length - i - 1) + i + 1;
            int temp = arr[i];
            arr[i] = arr[randomNum];
            arr[randomNum] = temp;
        }

        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
