
public class NextNumber {

	public static void main(String[] args) {
		System.out.println("Even odd");
		System.out.println(NextNumber.nextNum(12465));
		System.out.println(NextNumber.nextNum(111222));

		System.out.println(NextNumber.nextNum(12465));
		System.out.println(NextNumber.nextNum(12466));
		System.out.println(NextNumber.nextNum(13575));
		System.out.println(NextNumber.nextNum(123456));

	}

	public static int nextNum(int num) {
		
		
		int temp=num;
		int evenNo=0,oddNo=0;
		int value;
		while(num!=0)
		{
			int remainder=num%10;
			if(remainder%2==0)
			{
				evenNo++;
			}
			else
			{
				oddNo++;
			}
			num=num/10;
		}
		if(evenNo>oddNo)
		{
			value=(temp%2==0)? temp+2 : temp+1;
		}
		else if(oddNo==evenNo)
		{
			value=temp;
		}
		else
		{
			value=(temp%2!=0)? temp+2 : temp+1;
		}
		
		return value;

	}

}