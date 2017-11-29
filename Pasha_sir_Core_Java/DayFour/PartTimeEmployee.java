package dayfour;

public class PartTimeEmployee extends FullTimeEmployee{
	
	protected int hoursWorked;

	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(int id, String name,int salary, int hoursWorked) {
		super(id,name,salary);
		this.hoursWorked = hoursWorked;
	}

	public int computeSalary()
	{
		return hoursWorked*150;
	}
	
	
	public void showDetails()
	{
		System.out.println("The ID Of Employee is: "+id);
		System.out.println("The Name of Employee is: "+name);
		System.out.println("The Salary Of Employee is: "+ computeSalary());
	}

	
}
