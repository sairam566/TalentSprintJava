class OddRounder {
    public static void main(String[] args) {
        int num = 327;
        System.out.println(oddRounder(num));
    }

    public static int oddRounder(int num) {
		if(num<0)
		{
			return -1;
		}
		if(num==0)
		{
			return -2;
		}
		if(num%2==0)
		{
			return num;
		}
		else
		{
			num=((num/10)+1)*10;
		}
       return num;
    }

} 
