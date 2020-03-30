
package StringAss;

public class Palantrome {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="121";
		StringBuffer sb=new StringBuffer(str);
		String news=sb.reverse().toString();
//		char ch[]=new char[10];
//		String newstr=" ";
//		int i,k=0;
//		for(i=1;i<=str.length();i++)
//			{
//			//ch[k]=str.charAt(str.length()-i);
//			k++;
//			}
//		for(int i1=str.length();i1>=0;i1--)
//		{
//			newstr+=str.charAt(i1);
//		}
//		//newstr=String.valueOf(ch);
//		System.out.println(newstr);
		if(str.equalsIgnoreCase(news))
		{
			System.out.println("Palintrome");
		}
		else
			{
			System.out.println("Not palintrome");
			}
		//String str3=Ass7.reversString(str);
		
	}
}
