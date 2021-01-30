package com.company;

public class Main {
    public static void main(String[] args) {
        short A = -25, B = 102;
        if (A > B) {
            System.out.println("The largest number is " + A + ", the smallest number is " + B);
        } else {
            System.out.println("The largest number is " + B + ", the smallest number is " + A);
        }
        if (A != B) {
            System.out.println(A + " does not equal " + B);
        } else {
            System.out.println(A + " equals " + B);
        }
        if (A % 2 == 0 || B % 2 == 0) {
            System.out.println("Even number is " + B + ", odd number is " + A);
        } else {
            System.out.println("Even number is " + A + ", odd number is " + B);
        }
        if (A < 0 || B < 0) {
            System.out.println("There are negative variables");
        }
        if (A > 0 || B > 0) {
            System.out.println("There are positive variables");
        }
        if (A < 100 || B < 100) {
            System.out.println("There are variables <100");
        }
    }
}
