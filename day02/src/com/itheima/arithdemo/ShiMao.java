package com.itheima.arithdemo;

import java.util.Scanner;

public class ShiMao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的时髦程度(一个0-10之间的整数): ");
        int shiMao_self = sc.nextInt();
        System.out.println("请输入对方的时髦程度(一个0-10之间的整数): ");
        int shiMao_else = sc.nextInt();
        System.out.println(shiMao_self > shiMao_else);
    }
}
