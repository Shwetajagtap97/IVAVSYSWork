package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Ass29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("Pink");
		al.add("Green");
		al.add("White");
		al.add("Black");
		al.add("Orange");
		synchronized(al)
		{
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
	}

}
