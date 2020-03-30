package Collection;

import java.awt.SystemTray;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		al.add("Red");
		al.add("Green");
		al.add("White");	
		al.add("Black");
		System.out.println("ArrayList:"+al);
		int ch;
		do
		
		{
			System.out.println("\nMenu\n1.Add\n2.Updated\n3.Delete\n4.Exit");
			 ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter Pistion to Add element:");
					int pos=sc.nextInt();
					System.out.println("Enter Color:");
					String color=sc.next();
					al.add(pos-1, color);
					System.out.println("ArrayList:"+al);
					break;
			case 2:System.out.println("Which color want to update:");
					String oldcolr=sc.next();
					System.out.println("Enter new colco to Updat :");
					String newcolr=sc.next();
					al.set(al.indexOf(oldcolr), newcolr);
					System.out.println("ArrayList:"+al);
				break;
			case 3:System.out.println("Enter Color:");
					String removecoclo=sc.next();
					al.remove(removecoclo);
					System.out.println("ArrayList:"+al);
				break;
			 default:
					System.exit(0);
			}
		}while(ch!=4);
		
		
	}

}
