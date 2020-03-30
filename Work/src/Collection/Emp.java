package Collection;

public class Emp {
	private String name;
	private int salary;
	private int id;
	public Emp(String name,int salary,int id){
		this.name=name;
		this.salary=salary;
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public int getId()
	{	
		return  id;
	}
	public String toString()
	{
		return "Id:"+this.id+"\tName:"+this.name+"\tSalary:"+this.salary;
		
	}

}
