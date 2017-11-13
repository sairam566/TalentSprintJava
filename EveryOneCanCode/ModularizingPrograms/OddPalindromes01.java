public class OddPalindromes01 {
    public static void main(String[] args) {
        int num1 = 1500;
        int num2 = 2000;
        System.out.println(generateOddPalindromes(num1, num2));
    }

    public static String generateOddPalindromes(int start, int limit) {
    	if (start <= 0 || limit <= 0) {
			return "-1";
		}
    	if (start >= limit) {
			return "-2";
		}
    	
    	String result="";
        for(int num=start;num<=limit;num++)
        {
        	if(isAllDigitsOdd(num))
        	{
        		if(isPalindrome(num))
        		{
        			result+=num+",";
        		}
        	}
        }
        if(result.length()==0)
        {
        	return "-3";
        }
        result=result.substring(0,result.length()-1);
        return result;
    }

    public static boolean isPalindrome(int num) {
        return (num==reverse(num));
    }

    public static int reverse(int num) {
        int reverse=0;
        while(num!=0)
        {
        	reverse=reverse*10+(num%10);
        	num=num/10;
        }
        return reverse;
    }

    public static boolean isAllDigitsOdd(int num) {
        int digit;
        while(num!=0)
        {
        	digit=num%10;
        	if(digit==0||digit==1||digit==3||digit==5||digit==7||digit==9)
        	{
        		
        	}
        	else
        	{
        		return false;
        	}
        	num=num/10;
        }
        return true;
    }
}
