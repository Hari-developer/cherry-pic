package com.java.cherry_pic.sample.service;

public class Cat {
    public static void main(String[] args) {
        System.out.println("Cat.......");

        new Cat().eating();
    }

    public void eating(){
        System.out.println("cat is eating....");
        new Cat().running();
    }
    public void running(){
        System.out.println("cat is running...!!");
    }
}
