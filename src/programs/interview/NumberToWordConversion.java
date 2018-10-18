package programs.interview;

public class NumberToWordConversion {
	public static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
			"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
			"nineteen" };

	public static final String[] tens = { "", // 0
			"", // 1
			"twenty", // 2
			"thirty", // 3
			"forty", // 4
			"fifty", // 5
			"sixty", // 6
			"seventy", // 7
			"eighty", // 8
			"ninety" // 9
	};

	public static String convert(final int n) {
		if (n < 0) {
			return "minus " + convert(-n);
		}

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + " " + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " hundred" + " " + convert(n % 100);
		}

		if (n < 1000000) {
			return convert(n / 1000) + " thousand" + " " + convert(n % 1000);
		}

		if (n < 1000000000) {
			return convert(n / 1000000) + " million" + " " + convert(n % 1000000);
		}

		return convert(n / 1000000000) + " billion" + " " + convert(n % 1000000000);
	}

	public static void main(final String[] args) {
		System.out.println(convert(34565));
	}
}
