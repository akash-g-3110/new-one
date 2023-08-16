package com.String;

public class StringClass {

    public static void main(String[] args) {
        String name="  akash";
        String name1="  akanshara";
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(3));
        System.out.println(name.concat(name1));
        System.out.println(name.contentEquals(name1));
        System.out.println(name.intern());
        System.out.println(name.lines());
        System.out.println(name1.strip());

    }
}
