package java_interview;

import java.util.Scanner;

public class Even_odd {
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		 int num= sc.nextInt();
		 
		if(num%2==0)
		{
			System.out.println("even");
		}
		else 
		{
			System.out.println("odd");
		}

	}

}
