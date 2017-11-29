package dayone;

class Sample{
	private int x,y;
	public void read()
	{
		x=10;
		y=19;
	}
	public void show()
	{
		System.out.println("The X value is :"+x);
		System.out.println("The y value is :"+y);
	}
	public void sum()
	{
		System.out.println("The sum of x and y is :"+(x+y));
	}
}




public class ClassDemo1 {

	public static void main(String[] args) {
		Sample obj=new Sample();
		obj.read();
		obj.show();
		obj.sum();

	}

}
