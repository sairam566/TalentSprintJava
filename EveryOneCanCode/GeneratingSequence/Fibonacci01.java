public class Fibonacci01 {
	public static void main(String[] args) {
	 	System.out.println(getFibonacciSeries(4));
	}
	public static String getFibonacciSeries(int num) {
		if(num>=1 && num<=40)
		{
			if(num==1)
			{
				return "0";
			}
			if(num==2)
			{
				return "1";
			}
			int n1=0,n2=1,temp;
			String result="0,1,";
			for(int i=2;i<num;i++)
			{
				temp=n1+n2;
				result+=temp+",";
				n1=n2;
				n2=temp;
			}
			return result;
		}
		return "-1";
	}
}
