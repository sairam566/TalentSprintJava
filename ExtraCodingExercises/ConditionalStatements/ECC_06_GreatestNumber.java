public class ECC_06_GreatestNumber {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = -10;
        System.out.println(getGreatest(n1, n2));
    }

    public static int getGreatest(int num1, int num2) {
    	if(num1<0 || num2<0)
    	{
    		return -1;
    	}
    	if(num1==0 ||num2==0)
    	{
    		return -2;
    	}
    	return (num1>num2? num1:num2);
    }
}
