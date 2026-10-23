package com.itheima.demo1;

public class Passengernum {
    public static void main(String[] args) {
        int number = 0;
        number++;
        number +=2;
        number -=1;    //number += 2 - 1;
        number +=2;
        number -=1;
        number -=1;
        number +=1;
        System.out.println("终点站乘客有:" + number + "名");

        //进制
        System.out.println("进制:" +  "\t" +  "\t" + "二" +  "\t" + "十" +  "\t" + "八" +  "\t" + "十六");
        System.out.println("代码表现形式:" +  "\t" + "0b" +  "\t" + "/" +  "\t" + "0" +  "\t" + "0x");
        System.out.println("终点站乘客有:" + number + "名");
        System.out.println(017);    //不用加引号
        
        //整数数据类型 byte([-128, 127]), short, int, long(后缀L标识)
        long b = 100000000000L;
        System.out.println(b); 

        //浮点数数据类型 float(后缀F标识), double
        float f = 10.2F;
        System.out.println(f);
        
        //取值范围大到小: dflisb

        //字符 char
        char c = '中';
        System.out.println(c);

        //布尔 boolean true, false两个值
        boolean bo = true;
        System.out.println(bo);
    }
}
