package Collection;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ass28 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ArrayList<String> al= new ArrayList<String>();
		al.add("Pink");
		al.add("Green");
		al.add("White");
		al.add("Black");
		al.add("Orange");
		FileOutputStream fos=new FileOutputStream("ArrayList");
		ObjectOutputStream opt=new ObjectOutputStream(fos);
		opt.writeObject(al);
		opt.close();
		fos.close();
		System.out.println("Arraylist data is saved in ArrayList");

	}

}
