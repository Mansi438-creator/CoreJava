// Organize Java package structure
package com.java.core.numbers;
import java.util.Scanner;

public class ReverseEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        for (; num > 0; num /= 10) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }

        System.out.println("Reversed number = " + reverse);

        if (reverse % 2 == 0) {
            System.out.println("Reversed number is Even");
        } else {
            System.out.println("Reversed number is Odd");
        }
    }
}
