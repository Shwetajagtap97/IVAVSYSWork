package ArrayAss;

import java.util.Scanner;

public class Ass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]={25,14,56,15,36,56,77,18,29,49};
		int arr[]=new int[a.length+1];
		System.out.println(a.length);
		System.out.println("Element in array:");
		for(int i=0;i<a.length;i++)
		{	
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter position:");
		int no=sc.nextInt();
		System.out.println("Enter No:");
		int num=sc.nextInt();
		for(int k=a.length-1;k>=0;k--)
		{
			if(k==no-1)
			{
				a[k]=num;
				break;
			}
			else
			{
				a[k]=a[k-1];
			}
		}
		System.out.println("After added :");
		for(int i=0;i<a.length;i++)
		{	
			System.out.print(a[i]+" ");
		}
	}

}
