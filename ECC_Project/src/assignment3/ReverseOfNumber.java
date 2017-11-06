package assignment3;

public class ReverseOfNumber
{
	public static void main(String[] args)
	{
		int number=100;
		int reverse;
		System.out.println("The Original is "+number);
		System.out.print("The Reverse is ");
		while(number!=0)
		{
			reverse= number % 10;
			System.out.print(reverse);
			number=number/10;
		}
		
		
	}
}
//while(number!=0)
//{
//	reverse=number%10;
//	System.out.print(reverse);
//	reverse=number/10;
//	break;
//}
