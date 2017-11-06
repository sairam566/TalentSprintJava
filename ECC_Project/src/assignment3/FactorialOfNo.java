package assignment3;

public class FactorialOfNo
{
	public static void main(String[] args)
	{
		int fact=5;
		int i=1;
		int output=1;
//		while(i<=fact)
//		{
//			output=output*i;
//			i++;
//		}
//		System.out.println(output);
		
		
		while(fact>=i)
		{
			output=output*fact;
			fact--;
		}
		System.out.println(output);
	}

}
