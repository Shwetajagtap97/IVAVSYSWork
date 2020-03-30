package Collection;

import java.util.Hashtable;
import java.util.Iterator;

public class Ass33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		ht.put(1,"Pink");
		ht.put(2, "Red");
		ht.put(3, "Green");
		ht.put(4, "Yellow");
		ht.put(5, "Black");
		ht.put(6, "Orange");
		System.out.println("HashTable:"+ht);
		Iterator it=ht.values().iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+"\t");
		}
	}

}
