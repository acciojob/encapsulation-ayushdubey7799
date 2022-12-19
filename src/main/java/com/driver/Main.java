package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rw = new RWOnly();
        rw.setName("Ayush");
        System.out.print(rw.getName());
//        'name' has private access in 'com.driver.RWOnly'
    }
}