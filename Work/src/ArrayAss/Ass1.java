package ArrayAss;

public class Ass1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={20,31,60,70,71,89,83,97,5};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		int avg=sum/a.length;
		System.out.println("Avg value of Array:"+avg);
	}

}
