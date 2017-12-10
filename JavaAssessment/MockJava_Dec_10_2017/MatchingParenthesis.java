public class MatchingParenthesis {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println(isMatchingParenthesis("(2+3)"));
		 System.out.println(isMatchingParenthesis("((a + b) * c)"));
		 System.out.println(isMatchingParenthesis("(a + b) * c)"));
		System.out.println(isMatchingParenthesis("(()"));

	}

	public static boolean isMatchingParenthesis(String text) {
		if (text == null) {
			return false;
		}
		if (text.length() == 0) {
			return true;
		}
		String openOrder = "",closeOrder="";
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(') {
				openOrder += "(";
			}
			if (text.charAt(i) == ')') {
				closeOrder+=")";
				if (openOrder.length() > 0) {
						openOrder = openOrder.substring(0, openOrder.length() - 1);
						closeOrder = closeOrder.substring(0, closeOrder.length() - 1);
				}
			}
		}
		if (openOrder.length() > 0 || closeOrder.length()>0) {
			return false;
		}

		return true;

	}
}
