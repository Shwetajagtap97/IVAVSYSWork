package Exception;

import java.util.Scanner;
class InvalidBalanace extends Exception{
	public InvalidBalanace()
	{
		System.out.println("\nAccount Balance should not be less than 1000\n Invalid Balance Amount");
	}
}

public class AmountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount:");
		int amount=sc.nextInt();
		if(amount<1000)
		{
			try
			{
				throw new InvalidBalanace();
			}
			catch(InvalidBalanace i)
			{
				i.printStackTrace();
			}
		}
		else
			System.out.println("Balance amount is Rs "+amount);
		
	}

}
