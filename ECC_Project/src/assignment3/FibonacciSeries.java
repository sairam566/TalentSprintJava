package assignment3;

public class FibonacciSeries 
{
	public static void main(String[] args)
	{
		int n1=0;
		int n2=1;
		int temp;
		int value=9;
		System.out.print("0 1 ");
		for(int i=2;i<value;i++)
		{
			temp=n1+n2;
			System.out.print(temp+" ");
			n1=n2;
			n2=temp;
		}
	}
}
