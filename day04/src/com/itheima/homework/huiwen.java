package com.itheima.homework;

import java.util.Scanner;

public class huiwen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("输入一个数字: ");
        int numreal = sc.nextInt();
        int num = numreal;
        int invertNum = 0;
        while(num / 10 != 0){   //错误1: 需要循环且不知道次数->用while
            invertNum = invertNum * 10 + num % 10;
            num /= 10;
        }
        invertNum = invertNum * 10 + num;
        if(invertNum == numreal) System.out.println("是回文数"); //错误2: num已经被修改.
            else System.out.println("不是回文数");
    }

    //上面这个代码还需要手动处理最后一位. 最简洁的是leetcode>HuiWen.java
    /*
    while(num != 0){
        invertNum = invertNum * 10 + num % 10;
        num /= 10;
    } */
}
