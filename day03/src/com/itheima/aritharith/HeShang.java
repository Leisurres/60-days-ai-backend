package com.itheima.aritharith;

import java.util.Scanner;

public class HeShang {
    public static void main(String[] args) {
        int height1 = 150, height2 = 210, height3 = 165;
        // 错误写法: int height1, height2, height3 = [150, 210, 165];
        int heightTemp = height1 > height2 ? height1 : height2;
        System.out.println(heightTemp > height3 ? heightTemp : height3);
        // -Java对缩进不严格

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身上带的钱: ");
        int money = sc.nextInt();
        if (money >= 100) {
            System.out.println("网红餐厅!");
        } else {
            System.out.println("沙县小吃!");
        }
    }
}
