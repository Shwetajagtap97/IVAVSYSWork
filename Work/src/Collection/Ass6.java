package Collection;

import java.util.Hashtable;

public class Ass6 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Emp,String> ht=new Hashtable<Emp,String>();
		
	
		ht.put(new Emp("Shweta",1500,123),"Admin");
		ht.put(new Emp("Ram",150,13),"Employee");
		//Emp e=new Emp("Shweta",1500,123);
		//ht.put(e, "Admin");
		System.out.println(ht);
		
	}

}
