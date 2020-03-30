package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ass35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		List<Integer> l=new ArrayList<>();
		l.add(18);
		l.add(3);
		l.add(89);
		l.add(75);
		l.add(96);
		l.add(45);
		l.add(26);
		l.add(78);
		System.out.println("List:"+l);
		List<Integer> l2=new ArrayList<>();
		System.out.println("Enter subList Lenght");
		int no=sc.nextInt();
	
		for(int i=0;i<no;i++)
		{
			System.out.println("Enter List");
			int n=sc.nextInt();
			l2.add(n);
		}
			if(l.containsAll(l2))
				System.out.println("List one Conatins subList"+l+"\t"+l2);
			else
				System.out.println("List one not Conatins subList"+l+"\t"+l2);

			
	}

}
