package Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class Ass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		ht.put(1, "Red");
		ht.put(2, "Pink");
		ht.put(3, "White");
		ht.put(4, "Black");
		ht.put(5, "Yellow");
		Enumeration	e=ht.elements();
		while(e.hasMoreElements())
		{
			System.out.print(e.nextElement()+" ");
		}

	}

}
