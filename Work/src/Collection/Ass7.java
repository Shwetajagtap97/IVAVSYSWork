package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.function.BiConsumer;

public class Ass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] count=new int[90];
		HashMap hm=new HashMap();
		hm.put(1, "A");
		hm.put(2, "B");
		hm.put(3, "C");
		hm.put(4, "A");
		hm.put(5, "A");
		System.out.println(hm);
		System.out.println(hm.get(1));
		//hm.remove("A");
		int i=0;
		for( i=1;i<=hm.size();i++)
		{
			for(int j=2;j<=hm.size();j++)
			{
				if(hm.get(i).equals(hm.get(j)))
					count[i]++;
			}
		}
		for( i=1;i<=hm.size();i++)
		{
		if(count[i]>1)
			hm.remove(i);
		}
		
		System.out.println(hm);
		
	}

}
