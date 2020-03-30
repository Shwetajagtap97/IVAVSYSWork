package Exception;

import java.util.Scanner;

class AgeNotValid extends Exception{
	public AgeNotValid()
	{
		System.out.println("\nAge should not be less than 18\nAge Not Valid");
	}
}

public class AgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=sc.nextInt();
		if(age<18 )
		{
			try {
				throw new AgeNotValid();
			} catch (AgeNotValid e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
			System.out.println("Valid Age");

	}

}
