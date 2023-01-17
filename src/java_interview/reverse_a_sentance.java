package java_interview;

import java.util.Scanner;

public class reverse_a_sentance {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sentance");
	String sen = sc.nextLine();
	  sen = sen+" ";
	  String revsen = "";
	  String word = "";
	 
	for(int i=0;i<sen.length();i++)
	{
		 char ch=sen.charAt(i);
	  if(ch!=' ')
	  {
		word=word+ch;  
	  }
	  else {
		  revsen=word+" "+revsen;
		  word="";
		  
	  }

	}
System.out.println(revsen);
	}
}
