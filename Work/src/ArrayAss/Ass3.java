package ArrayAss;

import java.util.Scanner;

public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n[]={1,5,9,3,8,2};
		int newa[]=new int[n.length-1];
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]);
		}
		System.out.println();
		int j=0;
		System.out.println("Enter index to remove value:");
		int no=sc.nextInt();
		for(int i=0;i<n.length;i++)
		{	
			if(i==no-1)
			{
				n[i]=0;
			}
			
		}
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]);
		}
		
	}

}
