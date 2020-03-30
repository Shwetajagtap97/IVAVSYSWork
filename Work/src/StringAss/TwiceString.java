package StringAss;

public class TwiceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome";
		char ch[]=str.toCharArray();
		char newch[]=new char[ch.length*2];
		int k=0;
		for(int i=0;i<ch.length;i++){
			for(int j=0;j<2;j++)
			{
				newch[k]=ch[i];
				k++;
			}
		}
		String newstr=String.valueOf(newch);
		System.out.println(newstr);

	}

}
