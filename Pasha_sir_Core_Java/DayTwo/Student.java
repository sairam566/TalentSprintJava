package daytwo;

	class Student
	{
		private  int id;
		private String firstName;
		private String lastName;
		private String course;
		private Address address;
		private double fee;
		
		static int counter=100;
		public Student() {
			this.id=counter++;
		}

		public Student(String firstName, String lastName, String course,String doorNo,String street,String city, double fee) {
			
			this.id=counter++;
			this.firstName = firstName;
			this.lastName = lastName;
			this.course = course;
			this.address =new Address(doorNo,street,city);
			this.fee = fee;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getCourse() {
			return course;
		}

		public void setCourse(String course) {
			this.course = course;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		public int getId() {
			return id;
		}

		public double getFee() {
			return fee;
		} 

		@Override
		public String toString() {
			return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", course=" + course
					+ ", address=" + address + ", fee=" + fee + "]";
		}

		

		
		
		
		
		
		
	}



