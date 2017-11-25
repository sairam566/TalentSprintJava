public class AverageWordLength {

	public static void main(String[] args) {
		System.out.println(AverageWordLength.getAverageWordLength("Hi mom"));
		System.out.println(AverageWordLength.getAverageWordLength("hi everyone"));
		System.out.println(AverageWordLength.getAverageWordLength("how are you"));

	}

	public static int getAverageWordLength(String str) {
		
		if(str==null)
		{
			return -1;
		}
		if(str.length()==0)
		{
			return 0;
		}
		String duplicate=str.replaceAll(" ","");
		int noOfCharacters=duplicate.length();
		
		int wordCount=1;
		for(int i=0;i<noOfCharacters;i++)
		{
			if(str.charAt(i)==' ')
			{
				wordCount++;
			}
		}
		
		
		return noOfCharacters/wordCount;
	}

}