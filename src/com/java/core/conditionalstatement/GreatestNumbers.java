// Package updated
package com.java.core.conditionalstatement;

public class ConditionalStatements {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;
        int c = 7;

        if (a >= b) {

            if (a >= c) {
                System.out.println("Greatest number is: " + a);
            } 
            else {
                System.out.println("Greatest number is: " + c);
            }

        } 
        else {

            if (b >= c) {
                System.out.println("Greatest number is: " + b);
            } 
            else {
                System.out.println("Greatest number is: " + c);
            }
        }
    }
}
