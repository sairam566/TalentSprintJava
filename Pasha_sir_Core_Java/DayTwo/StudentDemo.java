package daytwo;

public class StudentDemo {

	public static void main(String[] args) {
		Student studentOne = new Student("sai","ram","Java","54-45","Santhapeta","Ongole",5656.0);
		System.out.println(studentOne);
		studentOne.setFirstName("Thadi");
		studentOne.setLastName("SaiRam");
		System.out.println(studentOne);
		Student studentTwo=new Student("Bhargave","xx","java","UnKnown","UnKnown","UnKnown",5654.00);
		System.out.println(studentTwo);
		System.out.println(studentTwo.getId());
		System.out.println(studentTwo.getFirstName());
		System.out.println(studentTwo.getLastName());
		System.out.println(studentTwo.getCourse());
		System.out.println(studentOne.getAddress().getDoorNo());
		System.out.println(studentTwo.getFee());
	}

}
