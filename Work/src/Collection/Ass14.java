package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ass14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Pink");
		a1.add("Green");
		a1.add("Black");
		System.out.println("ArrayList:"+a1);
		System.out.println("Enter Element:");
		String ele=sc.next();
		String newele=ele.substring(0, 1).toUpperCase()+ele.substring(1).toLowerCase();
		if(a1.contains(newele))
			System.out.println("Value "+newele+" Exists in ArrayList");
		else
			System.out.println("Value "+newele+" not Exists in ArrayList");
	}

}
