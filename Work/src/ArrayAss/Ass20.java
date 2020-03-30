package ArrayAss;

public class Ass20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{2,3,4},{5,2,3}};
		int b[][]={{-4,5,3},{5,6,3}};
		int sum[][]=new int[2][3];
		System.out.println("Matrix A:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Matrix B:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(b[i][j]+"\t");
				sum[i][j]=a[i][j]+b[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum:");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
