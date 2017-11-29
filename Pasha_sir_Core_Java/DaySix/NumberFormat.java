package daysix;

public class NumberFormat {

	public static void main(String[] args) {
		String name="";
		try
		{
			int x=Integer.parseInt(name);
			System.out.println(x);
		}
		catch(NumberFormatException numberformat)
		{
			numberformat.printStackTrace();
		}
		System.out.println("Successfull Execution of Program");
	}

}
