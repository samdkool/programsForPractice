package programs.interview;

public class ReverseNumber {
	public int numReverse(int number) {
		int reverseNum = 0;
		while (number != 0) {
			int digit = number % 10;
			reverseNum = reverseNum * 10 + digit;
			number = number / 10;
		}
		return reverseNum;
	}

	public static void main(String args[]) {
		ReverseNumber rn = new ReverseNumber();
		System.out.println(rn.numReverse(2345));
	}
}
