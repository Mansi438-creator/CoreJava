package core.java;
import java.util.Scanner;

public class CubeOfNumbers {

public static void main(String[] args) {
		// TODO Auto-generated method stub

	
           Scanner sc = new Scanner(System.in);

		        System.out.print("Input number of terms: ");
		        int n = sc.nextInt();

		        for(int i = 1; i <= n; i++) {

		            int cube = i * i * i;

		            System.out.println(
		                i + " Number is : " + i +
		                " and cube of " + i +
		                " is : " + cube
		            );
		        }

		        sc.close();
		    }
           
	}


