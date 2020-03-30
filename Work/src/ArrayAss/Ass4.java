package ArrayAss;

import java.util.Scanner;

public class Ass4 {
	public static void duplicateValue(int a[]){
		int count[]=new int[250];
		int no=a.length;
		int narr[]=new int[no];
		int flage;
		for(int i=0;i<no;i++)
		{
			for(int j=0;j<no;j++)
			{
				if(a[i]==a[j])
					count[i]++;
			}
			narr[i]=a[i];
			flage=0;
			for(int j=0;j<no;j++)
			{
				if(a[i]==narr[j])
					flage++;
			}
			if(flage==1)
			{
				if(count[i]>1)
					System.out.println(a[i]);
			}
			
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
		duplicateValue(a);

	}

}
