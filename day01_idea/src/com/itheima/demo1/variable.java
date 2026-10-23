package com.itheima.demo1;

public class variable {
    public static void main(String[] args) {
        
        String productName = "T-shirt";
        int stock = 50;
        double price = 129.9;
        boolean available = true;

        System.out.println("Product:" + productName);
        System.out.println("Stock:" + stock);
        System.out.println("Price:" + price);
        System.out.println("Available:" + available);

        stock = stock -3;
        System.out.println("Remainging Stock:" + stock);
    }
    
}