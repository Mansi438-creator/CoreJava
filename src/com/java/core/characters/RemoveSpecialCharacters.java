package com.java.core.characters;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str = "Java@123#";
		        String result = "";

		        // Traverse each character of the string
		        for (int i = 0; i < str.length(); i++) {

		            // Get the current character
		            char ch = str.charAt(i);

		            // Check if the character is a letter or digit
		            if (Character.isLetterOrDigit(ch)) {
		                // Add it to the result string
		                result += ch;
		            }
		        }

		        // Print the string after removing special characters
		        System.out.println(result);
		    }
		

	}


