
public class ReverseWords {

	public static void main(String[] args) {
		System.out.println(ReverseWords.reverse("talent sprint"));
		System.out.println(ReverseWords.reverse("abc efg"));
	}

	public static String reverse(String str) {
		if(str==null)
		{
			return null;
		}
		if(str.length()==0)
		{
			return null;
		}
		String words[]=str.split(" ");
		int length=words.length;
		String result="";
		for(int i=0;i<length;i++)
		{
			result+=reverseWord(words[i])+" ";
		}
		return result.trim();

	}
	
	
	public static String reverseWord(String word)
	{
		String reverseword="";
		int length=word.length();
		for(int i=length-1;i>=0;i--)
		{
			reverseword+=word.charAt(i);
		}
		
		return reverseword;
	}

}