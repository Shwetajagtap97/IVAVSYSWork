package Exception;

import java.util.Scanner;

class InvalidBYear extends Exception
{
	public InvalidBYear()
	{
		System.out.println("Invalid Birth Year");
	}
}

public class TestYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Birth Year");
		int year=sc.nextInt();
		if(year>=2020 || year>=20)
		{
			try
			{
				throw new InvalidBYear();
			}
			catch(InvalidBYear i)
			{
				i.printStackTrace();
			}
		}
		else
			System.out.println("Valid Birth year");
	}

}
