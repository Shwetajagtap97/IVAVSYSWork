package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ass36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al= new ArrayList<String>();
		al.add("Pink");
		al.add("Green");
		al.add("White");
		al.add("Black");
		al.add("Orange");
		System.out.println("Arraylist:"+al);
		Collections.rotate(al, 1);
		System.out.println("Rotated Arraylist:"+al);
	}

}
