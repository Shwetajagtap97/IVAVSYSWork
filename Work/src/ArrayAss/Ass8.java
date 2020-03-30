package ArrayAss;

public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={10,0,5,0,4,6,0,9,0};
		int max=5;
		int zero[]=new int[max];
		int no[]=new int[max];
		int k=0,j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				zero[j]=a[i];
				j++;
			}
			else if(a[i]!=0)
			{
				no[k]=a[i];
				k++;
			}
		}
		System.out.println("Zero of array:");
		for(int i=0;i<zero.length;i++)
		{
			System.out.print(zero[i]+" ");
		}
		System.out.println();
		System.out.println("No of array:");
		for(int i=0;i<no.length;i++)
		{
			System.out.print(no[i]+" ");
		}
	}

}
