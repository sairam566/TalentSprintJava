class ECC_05_EvenFinder {
    public static void main(String[] args) {
        int num = -21;
        System.out.println(isEven(num));
    }
    
    public static int isEven(int num) {
    	if(num<=0)
    	{
    		return -1;
    	}
    	else if(num%2==0)
    	{
    		return 1;
    	}
    	else
    	{
    		return 0;
    	}
    }
}
