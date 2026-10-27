package com.itheima.arithdemo;

import java.util.Scanner;

public class yunsuan {
    public static void main(String[] args) {
        System.out.println(10 % 3);

    // 数值拆分
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入一个三位数:");
    int number = sc.nextInt();
    int baiWei = number / 100;
    int shiWei = (number - 100 * baiWei) / 10;
    int geWei =  number - 100 * baiWei - 10 * shiWei;
    System.out.println("百位" + "\t" + "十位" + "\t" + "个位");
    System.out.println(baiWei + "\t" + shiWei + "\t" + geWei);
    //用取余运算就是...
    int geWei2 =  number % 10;
    int shiWei2 = number / 10 % 10; //公式是先除10再模10
    int baiWei2 = number / 100 % 10; //公式是先除100(/ 10 / 10)(再模10)
    //还可以补千位, 万位
    }
}
