package Exception;

import java.util.Scanner;
class InvalidPassword extends Exception{
	public InvalidPassword()
	{
		System.out.println("Invalid Password");
	}
}

class TestPassword 
{
	static String password="Admin123";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Password:");
		String pass=sc.next();
		if(!pass.equals(password))
		{
			try
			{
				throw new InvalidPassword();
			}
			catch(InvalidPassword i)
			{
				i.printStackTrace();
			}
		}
		else
			System.out.println("Login Successfully");
	
	}
}

