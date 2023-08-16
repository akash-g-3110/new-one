package com.recurrsion;

public class Recurssion {

    public static int calculatefactorial(int i) {
        if (i==0) {
            return 1;
        }else {
            return i* calculatefactorial(i-1);
        }
    }

    public static void main(String[] args) {
        int num = 10;
        int factorial = calculatefactorial(num);
        System.out.println(calculatefactorial(10));
    }
}
