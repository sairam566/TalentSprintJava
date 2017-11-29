package dayseven;

class InvalidAges extends Exception {
	public String toString() {
		return "Invalid Age\n";
	}
}

class Persons {
	private int age;
	private String name;

	public Persons() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Persons(int age, String name) throws InvalidAges {
		super();

		if (age <= 0) {
			
				throw new InvalidAges();
			
		}
		else{
		this.age = age;
		this.name = name;
	}
}

	public void ShowDetails() {
		System.out.println("Age  :"+ age);
		System.out.println("Name :"+ name);
	}

}

public class UserExceptionThrows {

	public static void main(String[] args) throws InvalidAges {
		Persons per1=new Persons(23,"sairam");
		per1.ShowDetails();
		Persons per2=new Persons(0,"Bhargav");
		
		per2.ShowDetails();
		
	}

}
