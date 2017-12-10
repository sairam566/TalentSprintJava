
public class NthTermQSequence {

	public static void main(String[] args) {
		System.out.println(NthTermQSequence.getNthTerm(10));

	}

	public static int getNthTerm(int n) {
		
		if(n<=0)
		{
			return -1;
		}
		int number=1;
		
		for(int i=2;i<=n;i++)
		{
			number+=i;
		}
		return number;
	}
	
	

}