package ArrayAss;

import java.util.Scanner;

public class Ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double d[]={22.3,14.2,4.5,6.3,8.9,7.4,77.1};
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]+" ");
		}
		System.out.println("\nEnter index no:");
		int n=sc.nextInt();
		System.out.println("Enter no:");
		double no=sc.nextDouble();
		double temp=0.0;
		for(int i=0;i<d.length;i++)
		{
			if(i==n-1)
			{	
				//temp=d[i];
				d[i]=no;
			}
			
		}
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]+" ");
		}
	}

}
