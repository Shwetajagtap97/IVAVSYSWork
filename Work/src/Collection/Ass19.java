package Collection;

import java.util.ArrayList;

public class Ass19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Pink");
		a1.add("Green");
		a1.add("Black");
		System.out.println(a1);
		for(int i=0;i<a1.size();i++)
		{
			for(int j=1;j<a1.size();j++)
			{
				if((a1.get(i).toString().compareTo(a1.get(j).toString()))>0)
				{	String str=(String) a1.get(i);
					a1.set(i, a1.get(j));
					a1.set(j, str);
				}
			}
		}
		System.out.println(a1);
	}

}
