package com.abstraction;

public class Chennai extends Abstraction{

    public static void main(String[] args) {
    Abstraction A=new Chennai();
    A.registration();
    A.verification();
    }
    @Override
    public void verification() {
        System.out.println("verified");

    }
}
