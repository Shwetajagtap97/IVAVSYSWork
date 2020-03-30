package Collection;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.function.Consumer;

public class Ass5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Hashtable ht=new Hashtable();
		
		HashSet hs=new HashSet();
		//Hashset hs=new hashtable();
		
		hs.add("A");
		hs.add("B");
		hs.add("E");
		hs.add("D");
		System.out.println(hs);
		
		System.out.println("Enter Color to Updat");
		String str=sc.next();
		System.out.println("Enter New Color");
		String newcolor=sc.next();
		hs.remove(str);
		hs.add(newcolor);
		System.out.println(hs);
	}

}
