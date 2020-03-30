package ArrayAss;

import java.util.Scanner;

public class Ass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]={25,14,56,15,36,53,77,18,29,49};
		int arr[]=new int[a.length-1];
		System.out.println("Element in array:");
		for(int k=0;k<a.length;k++)
		{	
			System.out.print(a[k]+" ");
		}
		System.out.println("\nEnter No to remvoe from array:");
		int no=sc.nextInt();
		int i=0;
		for( i=0;i<a.length;i++)
		{
			if(a[i]==no)
			{	
				break;
			}
			else 
				a[i]=a[i];	
		}
		while(i+1!=a.length)
		{
		a[i]=a[i+1];
		System.out.println(a[i]);
		i++;
		}
		System.out.println("After reomoving "+no+" From Array:");
		for(int j=0;j<a.length-1;j++)
		{	
			System.out.print(a[j]+" ");
		}
	}

}
