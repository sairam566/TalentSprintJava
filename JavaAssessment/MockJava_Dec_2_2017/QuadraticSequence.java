
public class QuadraticSequence {

	public static void main(String[] args) {
		System.out.println(QuadraticSequence.getQuadricSequence(5));

	}

	public static String getQuadricSequence(int n) {
		
		
		if(n<=0)
		{
			return null;
		}
		
		int sum=1;
		String result="1,";
		for(int i=2;i<=n;i++)
		{
			sum+=i;
			result=result+sum+",";
		}
		result=result.substring(0, result.length()-1);
		return result;
	}

}