import javax.xml.bind.annotation.W3CDomHandler;

public class SpinningString {

	public static void  main(String[] arg) {
		System.out.println(SpinningString.rotate("talent", 1));
		System.out.println(SpinningString.rotate("talent", 2));
		System.out.println(SpinningString.rotate("talent", 3));
		System.out.println(SpinningString.rotate("abc", 1));
		System.out.println(SpinningString.rotate("abc", 2));
		System.out.println(SpinningString.rotate("abc", 3));
	}

	public static String rotate(String str, int no_of_positions) {
		
		if(str==null)
		{
			return null;
		}
		if(no_of_positions<=0)
		{
			return str;
		}
		if(no_of_positions>str.length())
		{
				return str;
		}
		String copy=str.substring(0,str.length()-no_of_positions);
		String lastWords="";
		for(int i=str.length()-no_of_positions;i<str.length();i++)
		{
			lastWords+=str.charAt(i);
		}
		return lastWords+copy;
		
	}

}