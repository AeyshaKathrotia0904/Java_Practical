package java_interview;

import java.util.Scanner;

public class pass_35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();	
		int b=sc.nextInt();	
		int c=sc.nextInt();	
		int d=sc.nextInt();	
		if(a>=35 && b>=35 && c>=35 && d>=35)
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
