package com.itheima.homework;

import java.util.Scanner;

public class CunQian {
    public static void main(String[] args) {
        // T3
        Scanner sc = new Scanner(System.in);
        System.out.println("输入您要存入的金额:");
        double money = sc.nextDouble();
        System.out.println("输入您想存的年限:");
        int year = sc.nextInt();
        double liLv = 0;
        if (money >= 1000) {
            switch (year) {
                case 1:
                    liLv = 2.25;
                    break;
                case 2:
                    liLv = 2.7;
                    break;
                case 3:
                    liLv = 3.25;
                    break;
                case 5:
                    liLv = 3.6;
                    break;
            }
        } else
            System.out.println("无法存.");
        double finalMoney = money + money * liLv * 0.01 * year;
        System.out.println("最终得到:" + finalMoney + "元");
        // T4
        System.out.println("输入用户等级:");
        int grade = sc.nextInt();
        System.out.println("输入原价:");
        int jinE = sc.nextInt();
        double disJinE = jinE;
        if (grade == 1) {
            if (jinE >= 200)
                disJinE *= 0.75;
            else
                disJinE *= 0.8;
        } else {
            if (jinE >= 100)
                disJinE *= 0.9;
        }
        System.out.println("最终应付款:" + disJinE);
    }
}
