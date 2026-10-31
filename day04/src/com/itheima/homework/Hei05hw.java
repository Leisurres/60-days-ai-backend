package com.itheima.homework;

import java.util.Scanner;

public class Hei05hw {
    public static void main(String[] args) {
        // T6
        int[] intArr = { 12, 14, 23, 45, 66, 68, 70, 77, 90, 91 };
        int[] intArr2 = new int[intArr.length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.print("输入要插入的整数: ");
        int num = sc.nextInt();

        int index = intArr.length; // 比从0开始找简洁(for循环中有if else break的可以想能否用初值简化)
        for (int i = 0; i < intArr.length; i++) {
            if (num <= intArr[i]) {
                index = i;
                break;
            }
        }

        /*
         * int index = 0;
         * for (int i = 0; i < intArr.length; i++) {
         * if (num > intArr[intArr.length - 1]) { // 这里注意下标越界问题
         * index = intArr.length;
         * } else if (num <= intArr[i]) {
         * index = i;
         * break;
         * }
         * }
         */

        for (int i = 0; i < index; i++) {
            intArr2[i] = intArr[i];
        }

        intArr2[index] = num;

        for (int i = index + 1; i < intArr2.length; i++) {
            intArr2[i] = intArr[i - 1];
        }

        for (int i = 0; i < intArr2.length; i++) {
            System.out.print(intArr2[i] + " ");
        }

        System.out.println();
        // T7
        int[] arr = { 12, 14, 23, 45, 50, 66, 68, 70, 77, 90, 91 };
        int len = arr.length;
        int[] arrNew = new int[len];
        int indexL = 0, indexR = len-1;

        for(int i = 0; i < len; i++){
            if(arr[i] % 2 != 0){
                arrNew[indexL] = arr[i];
                indexL++;
            }else{
                arrNew[indexR] = arr[i];
                indexR--;
            }
        }

        for(int i = 0; i < len; i++){
            System.out.print(arrNew[i] + " ");
        }
    }

}
