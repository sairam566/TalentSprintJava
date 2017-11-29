package dayfive;
 
class Parent
{
	public void show()
	{
		System.out.println("Hi! this from Parent show()....");
	}
}
class Child extends Parent
{
	public void show()
	{
		System.out.println("Hi! this from Child show()....");
	}
}
 public class OverridingDemo1 {

	public static void main(String[] args) {
		Child child=new Child();
		child.show();

	}

}
