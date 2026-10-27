package com.itheima.homework;

import java.util.Scanner;

public class ZhiShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个正整数:");
        int x = sc.nextInt();
        /*  方法1: 
         * int i = 2;
         * if(x == 1){
         * System.out.println("不讨论");
         * }else{
         * for(; i <= x; i++){
         * if(x % i == 0) break;
         * }}
         * if(x == i) System.out.println("质数");
         */

        // 方法2: 标记思想
        boolean flag = true;
        // 循环, 2到x-1
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println("是质数");

        //简化思路: 假设x = a * b, a与b一定有一个<=sqrt(x), 另一个>=sqrt(x)
        //          所以for条件判断只需要i<(x的平方根)即可

        
    }
}
