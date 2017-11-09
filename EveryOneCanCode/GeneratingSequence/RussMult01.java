public class RussMult01 {
    public static void main(String[] args) {
        int n1 = 25475;
        int n2 = 35655;
        getProduct(11, 26);
    }
    public static void getProduct(int num1, int num2) {
        
    	if(num1<=0 || num2<=0)
    	{
    		//return "-1";
    	}
    	else if(num1>=100000 || num2>=100000)
    	{
    		//return "-2";
    	}
    	int sum=0;
    	while(num1!=0)
    	{
    		if(num1%2!=0)
    		{
    			sum=sum+num2;
    		}
    		num1=num1/2;
    		num2=num2*2;
    	}
    	System.out.println(sum);
    }
}