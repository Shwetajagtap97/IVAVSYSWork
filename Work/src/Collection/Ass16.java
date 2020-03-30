package Collection;

import java.util.HashMap;
import java.util.Iterator;

public class Ass16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1, "Rina");
		hm.put(2, "Smita");
		hm.put(3, "Asha");
		hm.put(4,"Shobha");
		System.out.println("HashMap:"+hm);
		Iterator it1=hm.values().iterator();
		Iterator it=hm.keySet().iterator();
		while(it.hasNext() && it1.hasNext())
		{	System.out.print(it.next()+" "+it1.next());
			System.out.println();
		}
	}

}
