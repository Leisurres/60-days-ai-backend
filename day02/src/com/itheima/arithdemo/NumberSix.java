package com.itheima.arithdemo;

import java.util.Scanner;

public class NumberSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数: ");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数: ");
        int number2 = sc.nextInt();
        System.out.println((number1 == 6 || number2 == 6)||((number1 + number2) % 6 == 0));
        //  number1 == 6 || number2 == 6 || (number1 + number2) % 6 == 0

        //两只老虎体重
        System.out.println("请输入第一只老虎体重: ");
        double weight1 = sc.nextDouble();
        System.out.println("请输入第二只老虎体重: ");
        double weight2 = sc.nextDouble();
        System.out.println(weight1 == weight2 ? "两只老虎体重相同" : "两只老虎体重不同");
        /* String result = 上面这个三元运算符; 
           sout result; 
           也是一样的结果 */  
    }
}
