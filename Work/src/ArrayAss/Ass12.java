package ArrayAss;

import java.util.Scanner;

public class Ass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]={25,14,56,15,36,56,77,18,29,49};
		System.out.println("Element in array:");
		for(int i=0;i<a.length;i++)
		{	
			System.out.print(a[i]+" ");
		}
		System.out.println("\nEnter no to find index");
		int no=sc.nextInt();
		int i=0;
		for( i=0;i<a.length;i++)
		{
			if(a[i]==no)
				break;
			else 
				System.out.println("invalid no");
		}
		System.out.println("Index postio of "+no+":"+i);
	}

}
