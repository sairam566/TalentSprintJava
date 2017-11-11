
public class LongestAscendingSumSequence {

	public static void main(String[] args) {
		int[] array ={4,5,6,2,1,2,3,4,12,6,4,2,1,5,8,9};
		System.out.print(getSum(array));
	}
	public static String getSum(int[] arr)
	{
		String tempResult="";
		String finalResult="";
		int    tempSum=0;
		int	   finalSum=0;
		int    i;
		for (i = 0; i <arr.length-1; i++) {
			if(arr[i]<arr[i+1])
			{
				tempSum=tempSum+arr[i];
				tempResult=tempResult+" "+arr[i];
			}
			else
			{
				tempSum=tempSum+arr[i];
				tempResult=tempResult+" "+arr[i];
				
					finalResult=tempResult;
					finalSum=tempSum;
					
				tempResult="";
				tempSum=0;
			}
			if(tempSum>finalSum)
			{
				finalResult=tempResult;
				finalSum=tempSum;
			}	
		}
		if(arr[i]>arr[i-1])
		{
			finalSum=finalSum+arr[i];
			finalResult=finalResult+" "+arr[i];
		}
		return finalResult+" "+finalSum;
	}

}
