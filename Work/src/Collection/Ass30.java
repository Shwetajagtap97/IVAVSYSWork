package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ass30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List l=new ArrayList<String>();
	l.add("Abc");
	l.add("MXE");
	l.add("Aman");
	l.add("Ashu");
	List<String> unmodifiablelist=Collections.unmodifiableList(l);
	System.out.println(l);
	unmodifiablelist.add("Usha");
	System.out.println(l);
	
	
	}

}
