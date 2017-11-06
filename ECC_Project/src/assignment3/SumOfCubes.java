package assignment3;

public class SumOfCubes
{
	public static void main(String[] args)
	{
		int value=5;
		int sum=0;
		for(int i=1;i<=value;i++)
		{
			sum+=(i*i*i);
		}
		System.out.println(sum);
	}

}
