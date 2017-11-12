import java.util.HashMap;
import java.util.Map;
import java.lang.*;


public class MaxSpan {
	public static int findMaxFrequency(int[] arr) {
		if("[I"!=arr.getClass().getName())
		{
			return 999;
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<=0)
			{
				return -1;
			}
		}
		int mainCount=0;
		int tempCount=0;
		int currentValue=0;
		int finalValue=-1;
		int notValue=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]!=notValue)
				if(arr[i]==arr[j])
				{
					currentValue=arr[i];
					tempCount++;
				}
			}
			notValue=currentValue;
			if(tempCount>mainCount)
			{
				finalValue=currentValue;
				mainCount=tempCount;
			}
			currentValue=0;
			tempCount=0;
		}
		return finalValue;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {11,23,66,66,2,22,22};
		System.out.println(findMaxFrequency(arr));
	}
}
