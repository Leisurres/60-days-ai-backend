package leetcode;

import java.util.Scanner;

public class QiuShangYu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int beiChuShu = sc.nextInt();
        int chuShu = sc.nextInt();
        int yuShu = beiChuShu;
        int shang = 0;
        while(yuShu >= chuShu){
            yuShu -= chuShu;
            shang++;
        }
        System.out.println("商:" + shang +", 余数: " + yuShu);
    }
    
}