package com.itheima.array;

public class YunYong_07 {
    public static void main(String[] args) {
        int[] arr = { 11, 22, 33, 44, 55 };
        bianLi(arr);
        int max = max(arr);
        System.out.println(max);
        System.out.println(chaZhao(arr,40));
        int[] arr2 = copyOfRange(arr, 1, 4);
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }

    public static void bianLi(int[] arr) { // 数组和其他基本数据类型一样, (数据类型 变量名).
        int len = arr.length; // 相当于形参名称为arr
        System.out.print("[");
        for (int i = 0; i < len ; i++) {
            if (i == len - 1)
                System.out.print(arr[len - 1]);
            else
                System.out.print(arr[i] + ",");
        }

        System.out.print("]");
        // 注意题目要求的输出细节. 不要把最后一个拎出来和]一起print, 逻辑不好解释.
        // sout();
        // 不打印任何数据, 只换行
    }

    public static int max(int[] arr){
        int len = arr.length;
        int max = arr[0];   //初始值还是老规矩: 数组里的数据
        for(int i = 1; i< len; i++){
            if(max < arr[i]) max = arr[i];
        }
        return max;
    }

    public static boolean chaZhao(int[] arr, int num){
        boolean flag = false;
        for(int i = 0; i< arr.length; i++){
            if(num == arr[i]){
                flag = true;
                break;  //break不能忘写! 1. 这两行也可以直接改成return true
            }
        }
        return flag; //2. 联动修改, 这里是 return false
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] arr2 = new int[to-from];
        for(int i = from, j=0; i<to;i++,j++){
            arr2[j] = arr[i];
        }
        return arr2;

        /* 伪造索引思想
        int index = 0;
        for(int i = from; i<to;i++){
            arr2[index] = arr[i];
            index++;
        }
         */
    }
}
