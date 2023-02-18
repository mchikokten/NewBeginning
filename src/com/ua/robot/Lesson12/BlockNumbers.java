package com.ua.robot.Lesson12;

public class BlockNumbers {

    static {
        System.out.println("Static Block (Block #1)");
    }

    {
        System.out.println("Block #2");
    }


    {
        System.out.println("Block #3");
    }

    public BlockNumbers() {
        System.out.println("BlockNumbers constructor (Block #4)");
    }


}
