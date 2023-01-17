package java_interview;

import java.util.Scanner;

public class reverse_a_sentance_split {
public static void main(String[] args) {
	
while(true) {
	System.out.println("Enter the Sentance");
			Scanner sc =new Scanner(System.in);
			String str = sc.nextLine();
			String rev="";
			String s[]=str.split(" ");
			for(int i=0;i<s.length;i++) {
		rev=s[i]+" "+rev;
			}
			System.out.println(rev);
		  }
}
}
