package Exception;

public class Ass6 {
	public int add(){
		try
		{
			return 1;
		}
		catch(Exception e)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ass6 a=new Ass6();
		a.add();
	}

}
