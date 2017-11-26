public class ProductPanlindrome {

	public static void main(String[] args) {
		final int START = 10;
		final int END = 100;

		System.out.println(ProductPanlindrome.getCount(START, END));
	}

	public static int getCount(int start, int end) {
		int panlindromeCount=0;
		for(int i=start;i<end;i++)
		{
			for(int j=start;j<end;j++)
			{
				if(isPanlindrome(i,j))
				{
					panlindromeCount++;
				}
			}
		}
		return panlindromeCount;

	}
	public static boolean isPanlindrome(int x,int y)
	{
		int multiply=x*y;
		int original=multiply;
		int reverse=0;
		while(multiply!=0)
		{
			int digit=multiply%10;
			reverse=reverse*10+digit;
			multiply=multiply/10;
		}
		if(original==reverse)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
