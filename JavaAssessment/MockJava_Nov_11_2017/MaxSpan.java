
public class MaxSpan {

	public static void main(String[] args) {
		int[] array={1,22,22,21,8,22,0};
		System.out.println(findMaxFrequency(array));
	}
	public static int findMaxFrequency(int[] arr)
	{
		int mainCount=0;
		int tempCount=0;
		int currentValue=0;
		int finalValue=-1;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					currentValue=arr[i];
					tempCount++;
				}
			}
			if(tempCount>mainCount)
			{
				finalValue=currentValue;
				mainCount=tempCount;
			}
		}
		return finalValue;
	}

}
