import java.util.Arrays;

public class AnagramsProg {
    public static void main(String[] args) {
        String str1 = " listen";
        String str2 = "slient";
        if (validateStrings(str1, str2) == 1) {
            System.out.println(isAnagrams(str1, str2));
        }
        System.out.println(validateStrings(str1, str2));
    }
    public static int validateStrings(String str1, String str2) {
      if(str1.length()<=0 || str2.length()<=0)
      {
    	  return -1;
      }
      if(str1.trim().contains(" ") || str2.trim().contains(" "))
      {
    	  return -2;
      }
      
        return 1;
    }

    public static boolean isAnagrams(String str1, String str2) {
    	char[] charArray1 = str1.toLowerCase().trim().toCharArray();
    	char[] charArray2 = str2.toLowerCase().trim().toCharArray();
    	Arrays.sort(charArray1);
    	Arrays.sort(charArray2);
    	String name1=new String(charArray1);
    	String name2=new String(charArray2);
    	if(name1.equalsIgnoreCase(name2))
    	{
    		return true;
    	}
    	return false;
    }
}