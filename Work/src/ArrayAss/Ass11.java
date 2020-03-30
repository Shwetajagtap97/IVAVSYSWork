package ArrayAss;

import java.util.Scanner;

public class Ass11 {
	public static void maxMinNo(int a[])
	{
		int l1=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>l1)
				l1=a[i];
		}
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
		if(a[i]<min)
			min=a[i];
		}
		System.out.println("Maximium  no:"+l1);
		System.out.println("Minimum no:"+min);
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
		System.out.println("Element in array:");
		for(int i=0;i<no;i++)
		{	
			System.out.print(a[i]+" ");
		}
		System.out.println();
		maxMinNo(a);
	}

}
