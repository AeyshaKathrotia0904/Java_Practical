package java_interview;

import java.util.Scanner;

public class biggest_number {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();
if(a>b && a>c)
    {	
		System.out.println("a is largest");
	}
	else if(b>c)
	{
		System.out.println("a is largest");
	}
	else 
	{
	System.out.println("c is largest");	
	
	}
	}}
