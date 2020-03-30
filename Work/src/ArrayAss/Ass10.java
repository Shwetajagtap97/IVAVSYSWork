package ArrayAss;

public class Ass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]={{1,2,-2,0},{-3,4,7,2},{6,0,3,1}};
		int b[][]={{-1,3,},{0,9,},{1,-11,},{4,-5,}};
		int ra=3,ca=4;
		int rb=4,cb=2;
		int mul[][]=new int[3][4];
		System.out.println("Matrix A:");
		for(int i=0;i<ra;i++)
		{
			for(int j=0;j<ca;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("Matrix B:");
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<ra;i++)
		{
			for(int j=0;j<cb;j++)
			{
				for(int k=0;k<ca;k++)
				{
					mul[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		System.out.println("Multipliaction Matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(mul[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
