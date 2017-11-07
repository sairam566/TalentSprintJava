public class Palindrome01 {
    public static void main(String[] args) {
        int num = 87;
        System.out.println(isPalindrome(num));
    }

    public static int isPalindrome(int num)
    {
       if(num>=100 && num<=999)
       {
    	   int num1,num2;
    	   num1=num/100;
    	   num2=num%10;
    	   if(num1==num2)
    	   {
    		   return 1;
    	   }
    	   return 0;
       }
       return -1;
    }
}