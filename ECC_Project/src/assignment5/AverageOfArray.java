package assignment5;

public class AverageOfArray {

	public static void main(String[] args) {
		int[] number={12,23,121,34,55};
		
		int sum=0;
		int average;
		
		for (int i = 0; i < number.length; i++) {
			sum+=number[i];
		}
		average=sum/number.length;
		System.out.println("The Average of the Array is "+average);
	}

}
