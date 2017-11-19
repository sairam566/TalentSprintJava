public class RangeWithStep {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 10;
        int step = 2;
        System.out.println(getNumbersInRange(n1, n2, step)); 
    }
	public static String getNumbersInRange(int num1, int num2, int step) {
		if(num1<=0 || num2<=0 || step<=0)
		{
			return "-1";
		}
		if(num1==num2)
		{
			return "-2";
		}
		if(num1>num2)
		{
			return "-3";
		}
		String result="";
		for(int i=num1+1;i<num2;i=i+step)
		{
			result=result+i+" ";
		}
		result=result.substring(0, result.length()-1);
		return result;
	   
	}
}