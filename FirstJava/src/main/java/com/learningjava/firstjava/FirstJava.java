package com.learningjava.firstjava;

public class FirstJava {
    public static void main(String[] args) {

        String firstname = "James";
        String lastname = "Bond";
        int age = 45;

        System.out.println("Hi, my name is " + firstname + " " + lastname +
                ", and I'm " + age + " years old.");

        /* Boolean */
        boolean isHappy = true;
        boolean isDone = false;
        System.out.println(isHappy + " " + isDone);

        /* Char */
        char c = 'C';
        System.out.println(c);

        /* Numerics */

        byte aByte = 127; // -128 to 127 (8bits
        System.out.println(aByte);

        short aShort = 30000; // -32768 to 32767 (16bits
        System.out.println(aShort);

        long aLong = 7676443;
        System.out.println(aLong);

        /* Floating Point  32bits, 9 decimal places */
        float pi = 3.14f;
        System.out.println(pi);

        /* Double = 64bits, more than 10 decimal places */
        double dPie = 3.14 / 212;
        float fPie = 3.14f / 212;
        System.out.println("Double location: " + dPie);
        System.out.println("Float location: " + fPie);
    }
}