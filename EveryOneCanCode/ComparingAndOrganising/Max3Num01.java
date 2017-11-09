public class Max3Num01
{
    public static void main(String[] args)
    {
        int n1 = 42;
        int n2 = 1;
        int n3 = 12;
        System.out.println(getMaxNumber(n1, n2, n3));
    }

    public static int getMaxNumber(int num1, int num2, int num3) 
    {
    	if(num1>=1 && num2>=1 && num3>=1)
    	{
        int large;
        if(num1 > num2)
        {
        	large = num1;
        }
        else
        {
        	large = num2;
        }
        if(large < num3)
        {
        	large = num3;
        }
        return large;
        }
    	else
    	{
    		return -1;
    	}
    }
}