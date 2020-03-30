package Collection;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class Ass26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hs=new HashMap<String, Integer>();
		hs.put("Mina", 123);
		hs.put("Rina", 456);
		hs.put("Shina", 789);
		try
		{
			FileOutputStream fops=new FileOutputStream("new.docx");
			ObjectOutputStream opt= new ObjectOutputStream(fops);
			opt.writeObject(hs);
			opt.close();
			fops.close();
			System.out.println("Serialzied HashMap data is saved in abc ");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
