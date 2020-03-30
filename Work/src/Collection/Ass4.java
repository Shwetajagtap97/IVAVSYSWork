package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		l.add("Red");
		l.add("Green");
		l.add("White");
		l.add("Black");
		System.out.println("Linked List:"+l);
		System.out.println("Enter Postion to Add element:");
		int pos=sc.nextInt();
		System.out.println("Enter Color:");
		String color=sc.next();
		l.add(pos-1, color);
		System.out.println("Linked List:"+l);
		ListIterator it1=l.listIterator();
		while(it1.hasNext())
		{	String clr=(String)it1.next();
			System.out.print(clr+" ");
		}
		System.out.println("Revers:");
		while(it1.hasPrevious())
		{	System.out.print(it1.previous()+" ");
		}
	}

}
