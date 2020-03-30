package ArrayAss;

import java.util.Scanner;

public class Ass5 {
	public void evenOddNo(int a[]){
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println("Even no:"+a[i]);
			}
			else
				System.out.println("odd no:"+a[i]);
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
		Ass5 as=new Ass5();
		as.evenOddNo(a);
	}

}
