package Collection;

import java.util.Scanner;

public class Ass45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num;
		int temp;
		int sum;
		int i=1;
		int n=0;
		System.out.println("Enter the Number:");
		num=sc.nextInt();
		sum=0;
		i=num;
		while(num>0)
		{
			n=num%10;
			num=num/10;
			sum=sum+(n*n*n);
		}
		if(sum==i)
			System.out.println(i+" is an Armstrong Number");
		else 
			System.out.println(i+" is not an Armstrong Number");
	}

}
