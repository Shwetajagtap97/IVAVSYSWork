package Exception;

import java.util.Scanner;
class DivdieByZero extends Exception{
	public DivdieByZero()
	{
		System.out.println("No Divide By Zero");
	}
}
public class TestNum {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator:");
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int deno=sc.nextInt();
		if(deno==0)
		{
			try
			{
				throw new DivdieByZero();
			}
			catch(DivdieByZero d)
			{
				d.printStackTrace();
			}
		}
	}

}
