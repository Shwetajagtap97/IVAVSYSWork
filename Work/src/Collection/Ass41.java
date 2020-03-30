package Collection;

import java.util.Scanner;

public class Ass41 {
	public static void primeNo(int no)
	{	int count = 0;
		for(int i=2;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count>1)
			System.out.println("Not Prime");
		else
			System.out.println("Prime");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int no=sc.nextInt();
		primeNo(no);
	}

}
