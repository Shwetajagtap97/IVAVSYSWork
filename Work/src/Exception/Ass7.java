package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ass7 {
	public void divide()
	{
		try
		{
			int ans=9/0;
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae);
		}
	}
	public void file() 
	{	try
	{
		FileInputStream fis=new FileInputStream("");
	}
	catch(IOException ie)
	{
		System.out.println(ie);
	}
	}
	public void array()
	{
		int a[]={1,2,3};
		try
		{
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
	}
	public void string()
	{
		String str="abc";
		try
		{
			System.out.println(str.charAt(5));
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println(se);
		}
		
	}
	public void classNull()
	{
		Ass7 a=null;
		try
		{
			a.classNull();
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
		}
	}
	public void classCast()
	{
		try
		{
		Object o=new String();
		Integer i=(Integer)o;
		}
		catch(ClassCastException ce)
		{
			System.out.println(ce);
		}
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Ass7 a=new Ass7();
		a.divide();
		a.file();
		a.array();
		a.string();
		a.classNull();
		a.classCast();
	}

}
