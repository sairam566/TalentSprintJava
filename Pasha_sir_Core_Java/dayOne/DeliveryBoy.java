package dayone;

public class DeliveryBoy {

	public static void main(String[] args) {
		int targetFloor=0;
		int groundFloor=1;
		String str="^^^vvvvv^^^^";
		char[] pattern=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			pattern[i]=str.charAt(i);
		}
		for(int j=0;j<pattern.length;j++)
		{
			if(pattern[j]=='^')
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
		System.out.println("No of Visits to Ground Floor "+groundFloor);
		System.out.println("Target floor "+targetFloor);

	}

}
