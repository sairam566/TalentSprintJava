package dayfour;

class Parent
{
	protected int x,y;
	
	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("Hi! this is parent class parameterized Constructor");
	}
	public Parent()
	{
		super();
		System.out.println("Hi! this is parent class Constructor");
	}
	public void showParent()
	{
		System.out.println("Hi! this is parent Show()...");
	}
}

class Child extends Parent
{
	private int z;
	public Child()
	{
		super();
		System.out.println("Hi! this is Child class Constructor");
	}
	
	public Child(int x, int y, int z) {
		super(x, y);
		this.z = z;
		
		System.out.println("Hi! this is child class parameterized Constructor");
	}
	public void sum()
	{
		System.out.println("The sum of X,Y,Z ="+ (x+y+z));
	}
	public void showChild()
	{
		System.out.println("Hi! this is Child Show()...");
	}
}


public class Inheritance {

	public static void main(String[] args) {
		Child child=new Child();
		child.showChild();
		child.showParent();
		//child.sum();
		Child child2=new Child(10,20,30);
		child2.showChild();
		child2.showParent();
		child2.sum();
	}

}
