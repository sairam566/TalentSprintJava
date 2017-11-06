package assignment3;

public class SumOfOdd {

	public static void main(String[] args) {

		int value=12;
		int sum=0;
		for(int i=1;i<=value;i+=2)
		{
			System.out.println(i);
			sum+=i;
		}
		System.out.println("The Sum of Odd Numbers "+sum);
	}

}
