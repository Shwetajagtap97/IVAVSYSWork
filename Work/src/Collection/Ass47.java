package Collection;

import java.util.Scanner;

public class Ass47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int reverInt=0;
		int num=sc.nextInt();
		int n=num;
		int no=0;
		while(num>0)
		{
			no=num%10;
			reverInt=reverInt*10+no;
			num=num/10;
		}
		if(reverInt==n)
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");
	}

}
