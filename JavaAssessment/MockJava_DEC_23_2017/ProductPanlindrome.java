public class ProductPanlindrome {

	public static void main(String[] args) {
		System.out.println(ProductPanlindrome.getCount());

	}

	public static int getCount() {
		int count=0;
	
		for(int i=10;i<=99;i++)
		{
			for(int j=10;j<=99;j++)
			{
				if(isPalindrome(i+" "+j))
				{
					count++;
				}
			}
		}
		
		
		return count;
	
	}
	
	public static boolean isPalindrome(String str){
		String[] numbers=str.split(" ");
		int number1=Integer.parseInt(numbers[0]);
		int number2=Integer.parseInt(numbers[1]);
		int value=number1*number2;
		int temp=value,reverse=0;
		while(value!=0)
		{
			int remainder=value%10;
			reverse=reverse*10+remainder;
			value=value/10;
		}
		if(reverse==temp)
		{
			return true;
		}
		return false;
	}
	

}