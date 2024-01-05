package com.lesson.inhertince;

public class Laptop extends PC{

    public void copy(){
        System.out.println("copying");
    }

    public static void main(String[] args) {

        Laptop laptop=new Laptop();

        laptop.burn();
        laptop.copy();
        laptop.write();

    }
}
