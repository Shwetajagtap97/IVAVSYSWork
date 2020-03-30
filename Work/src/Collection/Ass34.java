package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class Ass34 {
	public static int findMax(List l)
	{	int temp=0;
		int max=(int) l.get(0);
		for(int i=1;i<l.size();i++)
		{
			if(max <(int) l.get(i))
			{
				max=(int)l.get(i);
			}
		}
		return max;	
	}
	public static int findMin(List l)
	{	int temp=0;
		int min=(int) l.get(0);
		for(int i=1;i<l.size();i++)
		{
			if(min >(int) l.get(i))
			{
				min=(int)l.get(i);
			}
		}
		return min;	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		l.add(18);
		l.add(3);
		l.add(89);
		l.add(75);
		l.add(96);
		System.out.println("List:"+l);
		System.out.println("Max value from the List:"+findMax(l));
		System.out.println("Min value from the List:"+findMin(l));
		
		List<Integer> l2=new ArrayList<>();
		System.out.println("Enter subList Lenght");
		int no=sc.nextInt();
	
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter List");
			int n=sc.nextInt();
			l2.add(n);
		}
			System.out.println(l.containsAll(l2));
	}

}
