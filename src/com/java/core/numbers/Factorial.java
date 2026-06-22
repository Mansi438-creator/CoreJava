//Organize Java package structure
package com.java.core.numbers;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        
        System.out.println("The factorial of " + num + " is: " + factorial);
        
        sc.close();
    }


	}


