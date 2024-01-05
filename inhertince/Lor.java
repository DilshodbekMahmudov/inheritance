package com.lesson.inhertince;

public class Lor extends Surgeon {

    public void see(){
        System.out.println("seeing");
    }

    public static void main(String[] args) {

        Lor lor=new Lor();

        lor.treat();
        lor.see();
        lor.cut();



    }
}
