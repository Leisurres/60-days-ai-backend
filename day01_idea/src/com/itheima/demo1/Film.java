package com.itheima.demo1;

import java.util.Arrays;

public class Film {
    public static void main(String[] args) {
        String name = "送初恋回家";
        String[] act = {"刘鑫", "张雨提", "高媛"} ; //  String类型数组, 包含3个字符串
        int year = 2020;
        float score = 9.0F;

        System.out.println("电影信息表");
        System.out.println("------------------------");
        System.out.println("名称" + "\t" + "\t" + "主演" + "\t" + "\t" + "\t" + "年份" + "\t" + "评分");
        System.out.println(name + "\t" + Arrays.toString(act) + "\t" + year + "\t" + score);
        //Arrays.toString() 的作用就是将数组中的元素转换为可读的字符串
        //System.out.println(name + "\t" + act + "\t" + year + "\t" + score);   非要这样可以act[0]
        // act 输出的是哈希码而不是字符串

    }
}
