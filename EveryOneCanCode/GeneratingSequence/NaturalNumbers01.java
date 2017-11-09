public class NaturalNumbers01 {
	
    public static void main(String[] args) {
    	
        System.out.println(getNaturalNumbers(10, 20));
    }
	public static String getNaturalNumbers(int num1, int num2)	{
       if(num1<=0 || num2<=0)
       {
    	   return "-1";
       }
       if(num1>num2)
       {
    	   return "-2";
       }
       
       String result="";
    	
       for (int i = num1; i <=num2; i++) {
			result+=i+" ";
    	   }
    	 return result.trim();  
       }
	}
