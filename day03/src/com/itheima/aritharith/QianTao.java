package com.itheima.aritharith;

import java.util.Scanner;

public class QianTao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入左边界:");
        int leftNum = sc.nextInt();
        System.out.println("请输入右边界:");
        int rightNum = sc.nextInt();
        int sum = 0;
        for (int i = leftNum; i <= rightNum; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                sum++;
        }
        System.out.println(leftNum + "到" + rightNum + "这个范围内, 能被3, 5整除的数有" + sum + "个");
    }

}
