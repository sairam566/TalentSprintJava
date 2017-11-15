class ECC_08_OddRounder {
    public static void main(String[] args) {
        int num = 35;
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
        	return (((num/10)+1)*10);
        }
    }

} 

