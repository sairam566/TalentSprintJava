

public class Fibonacci_NthTerm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getNthTermOfFibonacciSeries(4));
	}

	public static int getNthTermOfFibonacciSeries(int nthTerm) {
		if(nthTerm<=0)
			return -1;
		if(nthTerm==1)
			return 0;
		if(nthTerm==2)
			return 1;
			
		return getNthTermOfFibonacciSeries(nthTerm-1)+getNthTermOfFibonacciSeries(nthTerm-2);
	}

}