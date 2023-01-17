package java_interview;

import java.util.Scanner;

public class digit_or_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();	
if(n>=-9 && n<=9)
{
	System.out.println("digit");
	}
else
{
	System.out.println("number");
	}
}}
