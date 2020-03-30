package Collection;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

public class Ass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Green");
		a1.add("Black");
		a1.add("White");
		a1.add("Pink");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add("Red");
		a2.add("Green");
		a2.add("Black");
		a2.add("");
		a2.add("Pink");
		System.out.println(a2);
		List l=new ArrayList();
		for(int i=0;i<a1.size();i++)
		{
			if(a1.get(i).equals(a2.get(i)))
				l.add("Yes");
			else
				l.add("No");		
		}
		System.out.println(l);
		

	}

}
