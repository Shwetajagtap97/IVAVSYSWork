package ArrayAss;

public class Ass17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]={'g','o','o','d',' ','m','o','r','i','n','g'};
		String str=String.valueOf(ch);
		String strarr[]=str.split(" ");
		for(int i=0;i<strarr.length;i++)
		{
			System.out.println(strarr[i]);
		}
	}
}
