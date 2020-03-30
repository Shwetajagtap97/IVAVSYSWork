package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Pink");
		a1.add("Green");
		a1.add("Black");
		Iterator i=a1.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}

}
