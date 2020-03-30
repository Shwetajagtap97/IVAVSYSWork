package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Ass21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l=new LinkedList<String>();
		l.add("abc");
		l.add("pqr");
		l.add("mn");
		l.add("xyz");
		System.out.println("LinkedList:"+l);
		
		ArrayList al=new ArrayList<String>(l);
		System.out.println("Arraylist:"+al);

	}

}
