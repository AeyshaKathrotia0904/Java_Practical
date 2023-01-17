package java_interview;

import java.util.Scanner;

public class swap_2_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("value of a is "+ a );
		System.out.println("value of b is "+ b);
	}
	
}
