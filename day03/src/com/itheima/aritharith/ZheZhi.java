package com.itheima.aritharith;

public class ZheZhi {
    public static void main(String[] args) {
        double heightMount = 8844430;
        double heightPaper = 0.1;
        double height = heightPaper;
        int count = 0;
        while(height < heightMount){
            height *= 2;
            count++;
    }
    System.out.println(count);
    }
    
}
