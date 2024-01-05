package com.lesson.inhertince;

public class Loudspeaker extends Subwoofer{

    public void create(){
        System.out.println("creating");

    }

    public static void main(String[] args) {

        Loudspeaker loudspeaker=new Loudspeaker();
        loudspeaker.say();
        loudspeaker.attract();
        loudspeaker.create();
    }
}
