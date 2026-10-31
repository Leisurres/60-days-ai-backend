package com.itheima.array;

public class Method {
    public static void main(String[] args) {
        playGame();
        zhouChang(20, 10);
        int mianJi = mianJi(10, 20);
        System.out.println(mianJi);

        System.out.println(compare(3,4,5,4));
    }

    // 类里面, main方法外面写方法
    public static void playGame() {
        System.out.println("玩游戏!");
    }

    public static void zhouChang(int chang, int kuan) {
        int zhouChang = (chang + kuan) * 2;
        System.out.println(zhouChang);
    }

    public static int mianJi(int chang, int kuan) {
        int mianJi = chang * kuan;
        return mianJi;
    }

    public static String compare(int c1, int k1, int c2, int k2) {
        int mian1 = mianJi(c1, k1);
        int mian2 = mianJi(c2, k2);
        return (mian1 > mian2)?"第一个大":"第二个大";
    }
}
