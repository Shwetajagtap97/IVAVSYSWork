package StringAss;

public class DuplicateChar {
	public static void duplicateCharater(String str){
		char ch[]=str.toCharArray();
		int count[]=new int[50];
		int flage=0;
		char newch[]=new char[ch.length];
		for(int i=0;i<ch.length;i++)
		{	
			for(int j=1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
					count[i]++;
			}
			flage=0;
			newch[i]=ch[i];
		for(int j=0;j<ch.length;j++)
			if(ch[i]==newch[j])
			{
				flage++;
			}
		if(flage==1)
		{	
			if(count[i]>1)
				System.out.print(ch[i]+":"+count[i]);
		}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Whizible";
		duplicateCharater(str);

	}
	

}
