package ArrayAss;

public class Asss18 {
	public static void intSort(int arr[])
	{int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
				if(arr[i]<arr[j])
				{
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
		}
		System.out.println("\nSorrted array:");
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]+" ");
		}
	}
	public static void stringSort(String str[])
	{
		String temp;
		for(int i=0;i<str.length;i++)
		{
			for(int j=0;j<str.length;j++)
				if((str[i].compareTo(str[j]))>0)
				{
					temp=str[j];
					str[j]=str[i];
					str[i]=temp;
				}
		}
		System.out.println("\nSorrted array:");
		for(int i=0;i<str.length;i++)
		{	
			System.out.print(str[i]+" ");
		}
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={68,79,84,92,56,98,22,23,19,100};
		System.out.println("Element in array:");
		for(int i=0;i<arr.length;i++)
		{	
			System.out.print(arr[i]+" ");
		}
		intSort(arr);
		String str[]={"my","name","is","shweta"};
		stringSort(str);
		
	}

}
