package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public class Ass17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm=new HashMap();
		hm.put(1, "Rina");
		hm.put(2, "Smita");
		hm.put(3, "Asha");
		hm.put(4,"Shobha");
		System.out.println("HashMap:"+hm);
		for(int i=1;i<=hm.size();i++)
		{	
			for(int j=2;j<=hm.size();j++)
			{	
				
				if((hm.get(i).toString().compareTo(hm.get(j).toString()))>0)
				{	System.out.print(hm.get(i).toString().compareTo(hm.get(j).toString()));
					String temp=(String) hm.get(i);
					hm.replace(i,hm.get(i),hm.get(j));
					hm.replace(j, hm.get(j), temp);
				}
			}
			System.out.println();
		}
		System.out.println(hm);
	}

}
