package Collection;

import java.util.HashSet;
import java.util.Scanner;

public class Ass15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HashSet hs=new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("Y");
		hs.add("C");
		System.out.println("HashSet:"+hs);
		System.out.println("Enter Element:");
		String ele=sc.next().toUpperCase();
		if(hs.contains(ele))
			System.out.println("Value "+ele+" Exists in HashSet"
					);
		else
			System.out.println("Value "+ele+" not Exists in HashSet");

	}

}
