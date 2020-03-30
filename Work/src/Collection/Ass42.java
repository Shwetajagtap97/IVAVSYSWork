package Collection;

public class Ass42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[]=new int[150];
		System.out.println("Prime No from 1 to 100:");
		for(int i=1;i<101;i++)
		{
			for(int j=2;j<101;j++)
			{
				if(i%j==0)
				{
					count[i]++;
				}
			}
			if(count[i]<2)
				System.out.print(i+" ");
		}

	}

}
