package daysix;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		int array[]={1,2,3,4,5};
		try
		{
			System.out.println(array[6]);
		}
		catch(ArrayIndexOutOfBoundsException arrayOut)
		{
			arrayOut.printStackTrace();
		}
		System.out.println("Successfull Execution of Program");

	}

}
