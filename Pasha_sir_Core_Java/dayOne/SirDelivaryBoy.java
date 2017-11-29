package dayone;

public class SirDelivaryBoy {

	public static void main(String[] args) {
		String str="^^^vvvvv^^^^";
		String result=getFloorCount(str);
		System.out.println(result);
	}
	public static String getFloorCount(String str)
	{
		
		int targetFloor=0,groundFloor=1;
		for(int j=0;j<str.length();j++)
		{
			if(str.charAt(j)=='^')
			{
				targetFloor++;	
			}
			else
			{
				targetFloor--;
			}
			if(targetFloor==0)
			{
				groundFloor++;
			}
	}
		return "No of Visits to Ground Floor :"+groundFloor+",Target floor :"+targetFloor;
	}
}
