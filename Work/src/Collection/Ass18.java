package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ass18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1=new ArrayList();
		a1.add("Red");
		a1.add("Pink");
		a1.add("Green");
		a1.add("Black");
		System.out.println(a1);
		String st=null;
		String str=null;
		Collections.sort(a1);
		
		System.out.println(a1);
	}

}
