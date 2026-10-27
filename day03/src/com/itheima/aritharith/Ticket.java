package com.itheima.aritharith;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的票号: ");
        int ticketNumber = sc.nextInt();
        if(ticketNumber >= 1 && ticketNumber <= 100){
            if(ticketNumber % 2 == 0){
                System.out.println("坐右边.");
            }else{
                System.out.println("坐左边");
            }
        }else{
            System.out.println("票号错误!");
        }
    }

}
