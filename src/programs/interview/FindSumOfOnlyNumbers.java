package programs.interview;

public class FindSumOfOnlyNumbers {
	/*
	 * Find the sum of numbers from a string if input is rge8g9r8g9d9e8 then output
	 * should be 51
	 */
	public static void getSum(String input) {
		int sum = 0;
		char[] character = input.toCharArray();
		for (int i = 0; i < character.length; i++) {
			if (Character.isDigit(character[i])) {
				sum = sum + Character.getNumericValue(character[i]);
			}
		}
		System.out.println("Sum is " + sum);
	}

	public static void main(String[] args) {
		getSum("5hk6hkjh4khl4");
		getSum("rge8g9r8g9d9e8");
	}
}
