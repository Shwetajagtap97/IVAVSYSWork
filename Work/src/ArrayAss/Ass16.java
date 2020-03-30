package ArrayAss;

import java.util.Scanner;

public class Ass16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
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
			sum=sum+a[i];
		}
		System.out.println("\nSum of Elemnt in Array:"+sum);
	}

}
