package Collection;

import java.util.Scanner;

public class Ass44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0;int second=1;int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No:");
		int no=sc.nextInt();
		for(int i=0;i<no;i++)
		{
			result=first+second;
			second=first;
			first=result;
			System.out.print(result+" ");
		}

	}

}
