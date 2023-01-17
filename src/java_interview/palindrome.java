package java_interview;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number");
			int no = sc.nextInt();//121
			int temp = no;
			int rev = 0;
			int rem;
			while(temp!=0)
			{
				rem=temp%10;
				rev=rev*10+rem;
				temp=temp/10;
			}
			if(no==rev)
			{
				System.out.println("palindrome");
			}
			else 
			{
				System.out.println("not palindrome");
			}
	}

}
	

