package com.company;

public class Main {

    public static void main(String[] args)
    {
    double a;

    for (int k = 0; k <= 10; k++)
    {
        System.out.print(a = k * (Math.PI/5));
        System.out.print(", " + Math.sin(a));
        System.out.print(", " + Math.cos(a));
        System.out.println();
    }
    }
}
