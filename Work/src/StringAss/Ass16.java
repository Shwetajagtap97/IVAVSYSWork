package StringAss;

public class Ass16 {
	public  static void oddChar(String str){
		char ch[]=str.toCharArray();
		int j=0;
		for(int i=0;i<ch.length;i++)
		{	
			if(ch[i]!=' ')
			{
					ch[j]=ch[i];
					j++;
					System.out.print(ch[i]);
			}
		}
		System.out.println();
		for(int i=0;i<ch.length;i++)
		{
			if(i%2==1)
			{
				System.out.print(ch[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is java program";
		oddChar(str);
		
	}

}
