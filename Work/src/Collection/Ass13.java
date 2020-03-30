package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class Ass13 {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("Y");
		hs.add("C");
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}

	}

}
