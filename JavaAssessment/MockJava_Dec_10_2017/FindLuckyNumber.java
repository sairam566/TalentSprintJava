import javax.xml.bind.ValidationEvent;

public class FindLuckyNumber {
    public static void main(String[] args) {
        String date = "25-NOV-2016";
       System.out.println(getLuckyNumber(date));
       System.out.println(getSumOfDigits(5678));
    }
    // return the lucky number, based on date of birth
    public static int getLuckyNumber(String date) {
		String datesplit[]=date.split("-");

		int day=getSumOfDigits(Integer.parseInt(datesplit[0]));
		
		int month=convertMMMtoMM(datesplit[1]);
	
    	int year=getSumOfDigits(Integer.parseInt(datesplit[2]));
    	
    	return getSumOfDigits(day+month+year);
        
    }

    // convert the given month in to number format(given "JAN" return 1)
    public static int convertMMMtoMM(String mon) {
		String month=mon.toLowerCase().substring(0,3);
		String months[]={"jan","feb","mar","apr","may","jun","jul","aug","sep","oct","nov","dec"};
		for(int i=0;i<months.length;i++)
		{
			if(months[i].equals(month))
			{
				return 1+i;
			}
		}
    	return 0;
		
    }
    
    // add the sum of all digits for the given number
    public static int getSumOfDigits(int num) {

    	if (num == 0) 
    	       return 0;
    	    return (num % 9 == 0) ? 9 : (num % 9);

    }
	
}
//int digit,sum=0;
//while(num!=0)
//{
//	digit=num%10;
//	sum+=digit;
//	num=num/10;
//}
//while(sum > 9)
//{
//	sum=getSumOfDigits(sum);
//}
//return sum;