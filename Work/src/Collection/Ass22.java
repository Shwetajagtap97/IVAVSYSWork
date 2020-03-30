package Collection;

import java.util.HashSet;

public class Ass22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		hs.add("Rina");
		hs.add("Mina");
		hs.add("Shina");
		hs.add("Usha");
		hs.add("Asha");
		System.out.println(hs);
	Object[] arr=hs.toArray();
	System.out.println("Array:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"\t");
	}

	}

}
