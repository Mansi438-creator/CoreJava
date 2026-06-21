package com.java.core.vowels;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        String str = "Hello World";
		        int count = 0;

		        // Traverse each character of the string
		        for (int i = 0; i < str.length(); i++) {

		            // Convert the current character to lowercase
		            char ch = Character.toLowerCase(str.charAt(i));

		            // Check whether the character is a vowel
		            if (ch == 'a' || ch == 'e' || ch == 'i' ||
		                ch == 'o' || ch == 'u') {

		                // Increase the vowel count
		                count++;
		            }
		        }

		        // Display the total number of vowels
		        System.out.println("Vowels: " + count);
		    }
		

	}


