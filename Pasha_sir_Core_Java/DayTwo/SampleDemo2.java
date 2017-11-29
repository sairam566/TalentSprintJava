package daytwo;

class Sample {
	private int x, y;

	public Sample() {
		System.out.println("This is Default Constructor");
	}

	public Sample(int x, int y) {
		System.out.println("This is parameterized Constructor");
		this.x = x;
		this.y = y;
	}

	public void show() {
		System.out.println("The Value of x =" + x);
		System.out.println("The Value of y =" + y);
	}
}

public class SampleDemo2 {

	public static void main(String[] args) {
		Sample obj1 = new Sample(100, 200);
		obj1.show();
		Sample obj2 = new Sample(10, 20);
		obj2.show();
		 new Sample();
	}

}
