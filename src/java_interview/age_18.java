package java_interview;

import java.util.Scanner;

public class age_18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int age=sc.nextInt();
		if(age>=18)
			{
			System.out.println("Valid");
			}
		else {
			System.out.println("Invalid");
		}	
		}
}
