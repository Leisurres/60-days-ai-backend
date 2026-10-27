package com.itheima.aritharith;

import java.util.Scanner;

// case穿透的案例

public class WeekPanDuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你想查询周几?");
        int week = sc.nextInt();
        switch (week) {
            /*
             * case 1:
             * case 2:
             * case 3:
             * case 4:
             * case 5:
             */
            case 1, 2, 3, 4, 5:
                System.out.println("工作日");
                break;
            /*
             * case 6:
             * case 7:
             */
            case 6, 7:
                System.out.println("休息日");
                break;
            default:
                System.out.println("没有这样的星期几.");
        }

        //区别匹配顺序和执行顺序, 匹配顺序default无论如何都最后
        // 执行: 一旦找到执行入口, 程序就会从那里开始向下执行, 直到break或switch结束

        int week2 = 8;
        switch (week2) {
            case 1:
                System.out.println("星期一");
                break;
            default:
                System.out.println("输入错误");
            case 2:
                System.out.println("星期二");
                break;
        }
    }
}

/*
 * Scanner sc = new Scanner(System.in);
 * sout("请输入一个整数:");
 * int choice = sc.nextInt();
 * switch(choice){
 * case 1:
 * sout("机票查询");
 * break;
 * case 2:
 * ...
 * case 3:
 * sout("机票改签");
 * break;
 * default:
 * break;
 * }
 */
