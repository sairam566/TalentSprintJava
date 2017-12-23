public class MCQEvaluation {

	public static void main(String[] args) {
		
		System.out.println(MCQEvaluation.evaluate(new char[]{'A','b','c','d','e','d','g','h','i'}, new char[]{'a','b','c','d','e','f','g','h','i'}));
		System.out.println(MCQEvaluation.evaluate(new char[]{'a','b','c','d','a','b','c','d','a'}, new char[]{'a','b','b','d','a','b','a'}));	

	}
	
	// 2 marks for right answer
	// No nagative marks
	
	public static int evaluate(char[] attempt, char[] key){
		
		int marks=0;
		if(attempt.length==key.length)
		{
			for (int i = 0; i < attempt.length; i++)
			{
				for (int j = i; j <=i; j++)
				{
					if(attempt[i]==key[j])
					{
						marks++;
					}
				}
			}
			return marks*2;
		}
		
		return -1;
		
	}
}