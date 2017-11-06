package assignment3;

public class GreatesOfThreeNo
{
	public static void main(String[] args)
	{
		int value1=98;
		int value2=99;
		int value3=95;
		if(value1>value2 && value1>value3)
		{
			System.out.println("Value "+value1+" is Big");
		}
		else if(value2>value3)
		{
			System.out.println("Value "+value2+" is Big");
		}
		else
		{
			System.out.println("Value "+value3+" is Big");
		}
	}
}
