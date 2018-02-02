
public class AddDuplicateValuesInArray
{
public static void main(String[] args) {
	int array[]={1,1,1,2,3,3,3,4,4,4,4,4};
	int checker=1,sum=0;
	int valid=1,invalid=-1;
	for(int i=0;i<array.length;i++)
	{
	
		valid=array[i];
		if(invalid!=valid)
		{
			
		
				for (int j = i + 1; j < array.length; j++)
				{
		
					if (array[i] == array[j])
					{
						checker++;
					}

				}
				
				if (checker % 2 != 0) {
					sum += array[i];
					
				}
				invalid = array[i];
				checker=1;
		}
	}
	
	System.out.println(sum);
}
}
