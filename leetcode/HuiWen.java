package leetcode;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num1 = sc.nextInt();
        int num = num1;
        //第一遍写的错误点:
        /* int weiShu = 1;
        while (num / 10 >= 1) {
            num /= 10;
            weiShu++;
        }
        //修改1:
        num = num1;

        int invertNum = 0;
        for(int i=1; i<= weiShu; i++){
            int j = num % 10;
            num /= 10;
            //修改2:
            //invertNum += j * 10^(weiShu - i);
            //java中幂次: Math.pow(10, weiShu - i)
            invertNum = invertNum * 10 + j;
        }
        boolean flag;
        if(invertNum == num1){
            flag = true;
        }else{
            flag = false;
        }
        System.out.println(flag); */

        int invertNum2 = 0;
        while (num1 != 0) {
            int x = num1 % 10;
            invertNum2 = invertNum2 * 10 + x;
            num1 /= 10;
        }
        System.out.println(invertNum2 == num);
    }
}
