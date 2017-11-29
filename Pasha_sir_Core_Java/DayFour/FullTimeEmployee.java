package dayfour;

public class FullTimeEmployee {
	protected int id;
	protected String name;
	protected double salary;
	
	public FullTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FullTimeEmployee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public double computeScalary()
	{
		return salary+2000;
	}
	public void showDetails1()
	{
		System.out.println("The ID Of Employee is: "+id);
		System.out.println("The Name of Employee is: "+name);
		System.out.println("The Salary Of Employee is: "+ computeScalary());
	}
}
