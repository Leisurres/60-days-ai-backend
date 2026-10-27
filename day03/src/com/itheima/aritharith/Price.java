package com.itheima.aritharith;

import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员等级:");
        int grade = sc.nextInt();
        if(grade == 1){
            System.out.println("实际应该支付" + 1000 * 0.9 + "元");
        }else if(grade == 2){
            System.out.println("实际应该支付" + 1000 * 0.8 + "元");
        }else if(grade == 3){
            System.out.println("实际应该支付" + 1000 * 0.7 + "元");
        }else{
            System.out.println("实际应该支付" + 1000 + "元");
        }
    }
}
