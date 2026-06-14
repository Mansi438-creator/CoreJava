package scanner;

import java.util.Scanner;

public class ReplaceVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter String: ");
		        String str = sc.nextLine();

		        String result = "";

		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            char lower = Character.toLowerCase(ch);

		            if (lower == 'a' || lower == 'e' || lower == 'i' ||
		                lower == 'o' || lower == 'u') {
		                result += "*";
		            } else {
		                result += ch;
		            }
		        }

		        System.out.println(result);
		    }
		
	}


