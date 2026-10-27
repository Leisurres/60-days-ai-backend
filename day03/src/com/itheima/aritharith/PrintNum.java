package com.itheima.aritharith;

public class PrintNum {
    public static void main(String[] args) {
        for(int i = 1 ; i<= 5 ; i++){
            System.out.println(6 - i);
        }
        /*for(int i = 5 ; i >= 1 ; i-- ){
        ...
        }
         */

        int sum = 0;
        for(int i = 1; i<=5; i++){
            sum += i;
        }
        System.out.println("和为:" + sum);

        sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
