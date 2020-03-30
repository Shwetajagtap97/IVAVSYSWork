package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class Ass23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Pink");
		a1.add("Green");
		a1.add("Black");
		System.out.println(a1);
		ListIterator it=a1.listIterator();
		
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		System.out.println();
		while(it.hasPrevious())
		{	String str=it.previous().toString();
			System.out.print(str+" ");
		}

	}

}
