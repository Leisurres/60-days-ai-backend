package com.itheima.demo1;

public class TutorInfo {
    public static void main(String[] args) {
        String name = "黑马谢广坤";
        int age = 18;
        char gender = '男';
        double height = 180.1;
        boolean single = false;

        System.out.println("教师个人信息表:");
        System.out.println("------------------------");
        System.out.println("姓名:" + "\t" + "\t" + "年龄:" + "\t" + "性别:" + "\t" + "身高:" + "\t" + "是否单身:" + "\t");
        System.out.println(name + "\t" + age + "\t" + gender + "\t" + height + "\t" + single + "\t");
    }
}
