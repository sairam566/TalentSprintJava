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
			for(int j=start+1;j<end;j++)
			{
				if(isPanlindrome(start,end))
				{
					
				}
			}
		}

	}
	public static boolean isPanlindrome(int x,int y)
	{
		
	}
}
