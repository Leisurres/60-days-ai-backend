package com.itheima.aritharith;

import java.util.Scanner;

public class Noodle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入想吃的面:");
        String noodle = sc.next();
        switch (noodle) {
            case "兰州拉面":                    //case "兰州拉面"->{}
                System.out.println("OK");      //也就是用箭头+大括号可以省略break也不会穿透
                break;                         // 并且一句的情况, 大括号也可以不写
            case "武汉热干面":
                System.out.println("OK");
                break;
            case "北京炸酱面":
                System.out.println("OK");
                break;
            case "陕西油泼面":
                System.out.println("OK");
                break;
            default:
                System.out.println("NO, 吃泡面.");
                break;
        }
    }
}
