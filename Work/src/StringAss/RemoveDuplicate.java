package StringAss;

public class RemoveDuplicate {
	public static void removeduplicateChar(String str){
		char ch[]=str.toCharArray();
		int flage=0;
		char newch[]=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{	flage=0;
			newch[i]=ch[i];
		for(int j=0;j<ch.length;j++)
			if(ch[i]==newch[j])
			{
				flage++;
			}
		if(flage==1)
		{
			System.out.print(ch[i]);
		}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Whizible";
		
		removeduplicateChar(str);
	}

}
