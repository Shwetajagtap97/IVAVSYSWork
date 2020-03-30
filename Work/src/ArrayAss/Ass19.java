package ArrayAss;

import java.util.Scanner;

public class Ass19 {
	public static void secondLargestno(int a[])
	{
		int l1=a[0];
		int l2=a[1];
		int temp=0;
		if(l2>l1)
		{
			temp=l1;
			l1=l2;
			l1=temp;
		}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]>l1)
			{
				l2=l1;
				l1=a[i];
			}
			else if(a[i]>l2 && a[i]!=l1)
			{
				l2=a[i];
			}
		}
		System.out.println("First Largest No:"+l1);
		System.out.println("Second Largest No:"+l2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]={68,79,84,92,56,98,22,23,19,100};
		secondLargestno(arr);
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
		secondLargestno(a);
		
	}

}
