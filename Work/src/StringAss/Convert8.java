package StringAss;

public class Convert8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="PUNE";
		char ch[]=str.toCharArray();
		char c='A';
		for(int i=0;i<ch.length;i++)
		{	//System.out.println(ch[i]+":"+i);
			c='A';
			do
			{
				c++;
			}while(c!=ch[i]);
			if(c==ch[i])
			{
				for(int j=0;j<3;j++)
				{
					c--;
				}
				System.out.print(c);
				
			}
			else
			{
				c++;
			}
			//System.out.print(c);
		}

	}

}
