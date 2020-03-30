package Exception;

public class Ass2 {
	public void m1()
	{
		m2();
		System.out.printf("1");
	}
	public void m2()
	{	m3();
		System.out.printf("2");
	}
	public void m3()
	{
		System.out.printf("3");
		try
		{
			int sum=4/0;
			System.out.printf("4");
		}
		catch(ArithmeticException ae){
			System.out.printf("5");
		}
		System.out.printf("7");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass2 a=new Ass2();
		a.m1();

	}

}
