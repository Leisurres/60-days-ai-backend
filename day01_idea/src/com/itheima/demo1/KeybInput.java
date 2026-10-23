package com.itheima.demo1;

import java.util.Scanner;

//1. 导包, 找到Scanner这个类在哪(导包要在类定义上面)

public class KeybInput {
    public static void main(String[] args) {
        //2. 创建对象, 表示现在要用Scanner这个类
        Scanner sc = new Scanner(System.in);    //System.in: 静态变量, 保存输入流变量

        System.out.println("请输入整数:");
        //3. 接受数据
        int i = sc.nextInt();   //sc.nextInt(): 方法, 读取一个整数  

        System.out.println("它 + 5 = " + (i+5));    //  一定要括号, 因为有字符串拼接
        //System.out.println(i+5);

        
        Scanner sc1 = new Scanner(System.in);   //这一步是说明要开始用Scanner包了, 不用重复创建对象
        System.out.println("请输入第一个整数:");
        int Int1 = sc1.nextInt();

        //Scanner sc2 = new Scanner(System.in);   
        System.out.println("请输入第二个整数:");
        int Int2 = sc1.nextInt();

        System.out.println("两数之和为: " + (Int1 + Int2));
    }
}

/*  import java.util.Scanner;
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    System.out.println(i);
 */
