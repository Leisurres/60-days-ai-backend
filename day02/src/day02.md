# Day 02 - Java 运算符
## 今日学习
- %是取余(1. 能否整除? 2. 是否偶数? 3. 斗地主发牌 %3)
- 整数参与计算, 最终结果是整数(想有小数要写成10.0)
- 隐式转换: 取值范围小->大; 强制转换: 取值范围大->小; (大->小: dflisb)
- 隐式转换两种规则： 1.取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算。 2. byte、short、char三种类型的数据在运算的时候，都会直接先提升为int，然后再进行运算。
- byte-ASCII码-int; 注意陷阱: 只要有字符串参与+, 就进行拼接操作

```java
public class OperatorDemo1 {
    public static void main(String[] args) {
        System.out.println('a' + "abc");//"aabc"
    }
}
```
- 强制转换: 取值范围大的强制赋给取值范围小的. 格式: 目标数据类型 变量名 = （目标数据类型）被强转的数据；
- 自增自减应用: 购物车 - 1 + 左右就是自减/自增实现的

```java
public class OperatorDemo2 {
    public static void main(String[] args) {
        int x = 10;
        int y = x++;    //先用后加, 10赋给y, 后x自增到11
        int z = ++x;    //先加后用, x自增到12, 后12赋给z
        System.out.println(x);  //12
        System.out.println(y);  //10
        System.out.println(z);  //12
    }
}
```
- += -= *= /= %=都隐含了强制类型转换(大->小)
- 逻辑运算符: & |(或 两边都假结果假) ^(异或 相同false不同true) !(非 取反)
- 使用案例: 登录界面>账号密码, 两个都为真->&
- 短路逻辑运算符: &&(左边false直接不执行右边) ||(左边true直接不执行右边)
## 核心知识点
- 

## 遇到的问题
- 问题：
- 解决方法：

## LeetCode
-

## tips
- 

## 明日复习
-
  