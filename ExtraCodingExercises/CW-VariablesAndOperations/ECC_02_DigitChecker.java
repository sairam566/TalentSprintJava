public class ECC_02_DigitChecker {
    public static void main(String[] args) {
        int num = -100;
        System.out.println(getDiffOfDigits(num));
    } 
    public static int getDiffOfDigits(int num) {
	if(num>=0 && num<=9)
	{
		return -1;
	}
    	
    if(num<0)
	{
		return -3;
	}
    if(num>=10 && num<=99)
	{
		int once;
		int tens;
		once=num%10;
		tens=num/10;
		return tens-once;
	}
    else
    {
    	return -2;
    }
    
    }
}
