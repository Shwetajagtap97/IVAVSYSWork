package StringAss;

import java.util.stream.IntStream;

public class Recursion {
	public static char reverString(String str)
	{	char ch=' ';
		if(!str.equals(" "))
		{
			ch=str.charAt(str.length()-1);
			String newstr=str.replace(ch,' ');
			return reverString(newstr);
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="String";
		System.out.println(str);
		Recursion r=new Recursion();
		char str2=reverString(str);
		System.out.println(str2);

	}

}
