package assignment5;

public class MultipleOfFiveInArray {

	public static void main(String[] args) {
		
		int[] number={1,2,3,34,5};
		
		for (int i = 0; i < number.length; i++) {
			if(number[i]%5!=0)
			{
				number[i]=(((number[i]/5)+1)*5);
				System.out.print(number[i]+" ");
			}
			else
			{
				System.out.println(number[i]+" ");
			}
		}

	}

}
