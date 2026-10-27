package com.itheima.homework;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        double yuRou = 24;
        double huaSheng = 8;
        double miFan = 3;
        double zong1 = yuRou + huaSheng + miFan;
        /* if (zong1 >= 30)
            zong1 *= 0.8; */
        //用三元运算符
        zong1 = (zong1>=30)?zong1*0.8:zong1;
        yuRou = 16;
        double zong2 = yuRou + huaSheng + miFan;
/*         if (zong1 <= zong2) {
            System.out.println(zong1);
        } else {
            System.out.println(zong2);
        } */
        System.out.println((zong1<=zong2)?zong1:zong2);
        

        //T7
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int num = sc.nextInt();
        int temp = num;
/*         int count = 1;
        while (temp / 10 != 0) {
            //判断位数的套路就是/10.
            temp /= 10;
            count++;
        }
        int sum = 0;
        for(int i = 1; i <=count; i++){
            sum += num % 10;
            num /= 10; 
        }
        System.out.println(sum); */

        //直接用while
        int sum = 0;
        /* while(temp / 10 != 0){
            int i = temp % 10;
            sum += i;
            temp /= 10;
        }
        sum += temp; */
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(sum);
        
        //
    }
}
