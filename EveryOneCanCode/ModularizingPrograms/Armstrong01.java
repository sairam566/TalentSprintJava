public class Armstrong01 {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 1999;
		System.out.println(generateArmstrongNums(num1, num2));
	}

	public static String generateArmstrongNums(int start, int limit) {
		if (start <= 0 || limit <= 0) {
			return "-1";
		}
		if (start >= limit) {
			return "-2";
		}
		String result = "";
		for (int i = start; i <= limit; i++) {
			if (isArmstrong(i)) {
				result += i + ",";
			}
		}
		if (result.length() == 0) {
			return "-3";
		} else
			return result.substring(0, result.length() - 1);
	}

	public static boolean isArmstrong(int num) {
		return (num == sumOfPowersOfDigits(num));
	}

	public static int sumOfPowersOfDigits(int n) {
		int sum = 0;
		int[] digits = getDigits(n);
		for (int i = 0; i < digits.length; i++) {
			sum += power(digits[i], digits.length);
		}
		return sum;
	}

	public static int[] getDigits(int n) {
		int numberLength = Integer.toString(n).length();
		int[] digits = new int[numberLength];
		int i = 0;
		while (n != 0) {
			digits[i] = n % 10;
			i++;
			n = n / 10;
		}
		return digits;
	}

	public static int power(int d, int p) {
		return (int) Math.pow(d, p);
	}
}
