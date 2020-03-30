package Collection;

import java.util.ArrayList;
import java.util.List;

public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("Red");
		al.add("Green");
		al.add("Orange");
		al.add("White");	
		al.add("Black");
		System.out.println("ArrayList:"+al);
		List l=al.subList(0, 3);
		System.out.println(l);
	}

}
