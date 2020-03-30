package Collection;

import StringAss.Recursion;

public class Ass46 {
	public static String reversString(String str){
		if(str.isEmpty())
		{
			return str;
		}
		else
			return reversString(str.substring(1))+str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi welcome to whizible";
		String newstr=reversString(str);
		System.out.println(newstr);

	}

}
