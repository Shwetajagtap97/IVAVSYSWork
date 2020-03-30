package ArrayAss;

import java.util.Scanner;

public class Ass15 {
	public static void secondMinNo(int a[]){
		int min1=a[0];
		int min2=a[1];
		int temp;
		if(min2<min1)
		{
			temp=min1;
			min1=min2;
			min2=temp;
		}
		for(int i=2;i<a.length;i++)
		{
			if(a[i]<min1)
			{
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2 && a[i]!=min1)
			{
				min2=a[i];
			}
		}
		System.out.println("\nSecond Minimum No:"+min2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a[]={-1,4,0,2,7,-3};
		int arr[]=new int[a.length+1];
		System.out.println("Element in array:");
		for(int i=0;i<a.length;i++)
		{	
			System.out.print(a[i]+" ");
		}
		secondMinNo(a);
	}

}
