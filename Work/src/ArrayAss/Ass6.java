package ArrayAss;

import java.util.Scanner;

public class Ass6 {
	public static void primeNo(int a[])
	{	int count=0;
		for(int i=0;i<a.length;i++)
		{	count=0;
			for(int j=1;j<=a[i];j++)
			{
				if(a[i]%j==0)
					count++;
			}
			if(count==2)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How manay elements in array:");
		int no=sc.nextInt();
		int a[]=new int[no];
		
		for(int i=0;i<no;i++)
		{	System.out.println("Enter Element in aray:");
			a[i]=sc.nextInt();
		}
		System.out.println("Prime No from an array:");
		primeNo(a);
	}

}
