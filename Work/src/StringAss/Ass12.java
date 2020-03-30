package StringAss;

public class Ass12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdefghijklmnopqrstuvwxy";
		int len=str.length();
		int i=0;
		for(i=2;;i++)
		{
			if(str.length()%i==0)
				break;
		}
		int start=0;
		int end=i;
		do
		{
		System.out.println(str.subSequence(start, end));
		start=end;
		end=end+i;
		}while(start!=len);
	}

}
