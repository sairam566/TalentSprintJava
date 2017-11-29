package dayseven;

class InvalidAge extends Exception {
	public String toString() {
		return "Invalid Age\n";
	}
}

class Person {
	private int age;
	private String name;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int age, String name) {
		super();

		if (age <= 0) {
			try {
				throw new InvalidAge();
			} catch (InvalidAge e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

public class UserException
{

	public static void main(String[] args) {
		Person per1=new Person(23,"sairam");
		per1.ShowDetails();
		Person per2=new Person(0,"Bhargav");
		
		per2.ShowDetails();
		
	}

}
