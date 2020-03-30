package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Ass20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Pink");
		a1.add("Green");
		a1.add("Black");
		System.out.println("ArrayList:"+a1);
		System.out.println("Enter the index to remove Element:");
		int index=sc.nextInt();
		a1.remove(index-1);
		System.out.println(a1);
	}

}
