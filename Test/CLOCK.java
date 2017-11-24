public class TimeCalculator {

	public static void main(String[] args) {
		int hours = 9;
		int minutes = 40;
		int seconds = 40;
		int addSeconds = 1;
		
		
		System.out.println("The old Time is: " + hours + " Hours " + minutes
				+ " minutes " + seconds + " Seconds");
		
		
		calculateTime(hours, minutes, seconds, addSeconds);

	}

	public static void calculateTime(int hours, int minutes, int seconds,int addSeconds) {

		if (hours > 24) {
			System.out.println("Invalid hours");
		}
		
		if (minutes > 60) {
			System.out.println("Invalid minutes");
		}
		
		if (seconds > 60) {
			System.out.println("Invalid Seconds");
		}
		

		seconds = seconds + addSeconds;
		if (seconds == 60) {
			seconds = 0;
			minutes = minutes + 1;
			if (minutes == 60) {
				minutes = 0;
				hours = hours + 1;
			}
		} 
		System.out.println("The old Time is: " + hours + " Hours " + minutes
				+ " minutes " + seconds + " Seconds");
	}

}
