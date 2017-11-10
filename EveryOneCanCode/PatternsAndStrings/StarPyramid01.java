public class StarPyramid01 {
    public static void main(String[] args) {
        System.out.print(starPattern(5));
    }

	public static String starPattern(int rows) {
		if(rows<=0)
		{
			return "-1";
		}
		String result="";
		for(int i=1;i<=rows;i++)
		{
			for(int j=rows-1;j>=i;j--)
			{
				result+=" ";
			}
			for(int k=1;k<=i;k++)
			{
				result+="* ";
			}
			result=result.substring(0,result.length()-1);
			result+="\n";
		}
		
		return result;
	}
}