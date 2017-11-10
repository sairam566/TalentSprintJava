package assignment5;

public class SortingArray {

	public static void main(String[] args) {
		
		int[] number={18,7,21,2,6,4,1};
		
		int temp;
		
		System.out.print("Array before Sort:");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
		
		for(int i=0;i<number.length-1;i++){
			
			for (int j = i+1; j < number.length; j++) {
				
				if(number[i]>number[j]){
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}	
		System.out.println("\n\n");
		System.out.print("Array After Sort:");
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i]+" ");
		}
	}
}
