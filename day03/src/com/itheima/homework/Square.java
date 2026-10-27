package com.itheima.homework;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个大于2的整数:");
        int x = sc.nextInt();
        int i = 1;
        while (i * i <= x) {
            i++;
        }
        System.out.println(x + "的平方根为" + (i-1));
    }
    
    //用for循环
    /* for(...;...;...){
           if(i * i == x){
           sout(i);
           break;
           }else if(i * i > x){     //注意体会, 不用写 i * i < x
           sout(i);
           break;
           }
    }
     */
}
