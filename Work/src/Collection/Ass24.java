package Collection;

import java.util.TreeMap;
import java.util.Iterator;



public class Ass24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap tr=new TreeMap();
		tr.put(1, "abc");
		tr.put(2, "xyz");
		tr.put(3, "pqr");
		tr.put(4, "lmn");
		System.out.println("TreeMap:"+tr);
		Iterator key=tr.keySet().iterator();
		Iterator value=tr.values().iterator();
		while(key.hasNext() && value.hasNext())
		{
			System.out.print(key.next()+":"+value.next()+"\t");
		}

	}

}
