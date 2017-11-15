public class ECC_31_FindSquare
{

	public static void main(String[] arg) {
		int num = 9;
		System.out.println(getSquare(num));
	}

	public static int getSquare(int num)
	{
		if(num==0)
		{
		     return -1;
		}
		if(num<0)
		{
		  return -2;
		}
        return num*num;	
	}
}
