package Collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ass27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		hs.put("Mina", 123);
		hs.put("Rina", 456);
		hs.put("Shina", 789);
		System.out.println("HashMap:"+hs);
		Map<String, Integer> mp=Collections.synchronizedMap(hs);
		Set set=mp.entrySet();
		synchronized(mp){
			Iterator i=set.iterator();
			while(i.hasNext())
			{
				Map.Entry me=(Map.Entry)i.next();
				System.out.println(me.getKey()+":"+me.getValue());
			}
			
		}

	}

}
