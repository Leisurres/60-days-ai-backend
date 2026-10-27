package com.itheima.homework;

import java.util.Random;
import java.util.Scanner;

// 含保底机制的写法

public class CaiShuZi {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int realNum = r.nextInt(100) + 1;
        int i = 0;   
        while (true) {
            System.out.println("猜多少?");
            int guessNum = sc.nextInt();
            i++;
            if(i == 3){
                System.out.println("猜对了! 数字就是" + guessNum);
                break;
            }
            if(guessNum == realNum){
                System.out.println("猜对了! 数字就是" + guessNum);
                break;
            }else if(guessNum > realNum){
                System.out.println(guessNum + "太大了, 往小了猜.");
            }else{
                System.out.println(guessNum + "太小了, 往大了猜.");
            }
    }
}
}
