public class RoundedSum {
	public static void main(String[] args) {
		int a = 23, b = 45, c = 57;
		System.out.println(sumOfRoundedValues(a, b, c));
	}
	public static int sumOfRoundedValues(int n1, int n2, int n3) {
		if (n1 <= 0 || n2 <= 0 || n3 <= 0) {
			return -1;
		}
		return calculNum(n1)+calculNum(n2)+calculNum(n3);
	}	
	public static int calculNum(int a)
	{
		int once,result; 
		once=a%10;
		if(once<5) {
		result=(a/10)*10;
		}
		else{
			result=((a/10)+1)*10;
		}
		return result;
	}
}