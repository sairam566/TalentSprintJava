package dayfive;

class Sample
{
	public void sum(int x,int y)
	{
		System.out.println("The Addition of 2 Integers is:"+ (x+y));
	}
	public void sum(int x,int y,int z)
	{
		System.out.println("The Addition of 3 Integers is:"+ (x+y+z));
	}
	public void sum(double x,double y)
	{
		System.out.println("The Addition of 2 Doubles is:"+ (x+y));
	}
}


public class OverloadingDemo {

	public static void main(String[] args) {
	Sample sample=new Sample();
	sample.sum(10, 20);
	sample.sum(10.2,90.11);
	sample.sum(1,2,3);

	}

}
