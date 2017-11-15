public class JulianDate01 {
	public static void main(String[] args) {
		String date = "05-dec-2016";
		System.out.println(dateFormat(date));
	}

	public static String dateFormat(String date) {
		String[] dateParts = date.split("-");
		int dd = Integer.parseInt(dateParts[0]);
		int mon = convertMMMtoMM(dateParts[1]);
		String jDay = julianDate(dd, mon);
		return (dateParts[2] + jDay);
	}

	public static String julianDate(int dd, int mon) {

		int[] MONTHS = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365 };

		int jDay = MONTHS[mon - 1] + dd;

		String day = "";

		if (jDay <= 9)
			day = "00" + jDay;
		else if (jDay <= 99)
			day = "0" + jDay;
		else
		day=""+jDay;
		return day;
	}

	public static int convertMMMtoMM(String mon) {
		String months = "JANFEBMARAPRMAYJUNJULAUGSEPOCTNOVDEC";
		mon = mon.substring(0, 3).toUpperCase();
		return ((months.indexOf(mon) / 3) + 1);
	}
}