package com.itheima.aritharith;

import java.util.Scanner;

//要用箭头就所有case统一用, 箭头就可以少写一个break

public class week {
    public class WeekPanDuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你想查询周几?");
        int week = sc.nextInt();
        switch (week) {
            case 1, 2, 3, 4, 5-> System.out.println("工作日");
            case 6, 7-> System.out.println("休息日");
            default-> System.out.println("没有这样的星期几.");
        }
    }
}
}
