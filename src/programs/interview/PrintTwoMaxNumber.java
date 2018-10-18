package programs.interview;

public class PrintTwoMaxNumber {
	
	// Printing two max numbers of an array
	
	public static void printTwoMaxNum(int[] input)
	{
		int maxOne = 0;
		int maxTwo = 0;
		for(int number: input)
		{
			if(maxOne < number)
			{
				maxTwo = maxOne;
				maxOne = number;
			}
			else if(maxTwo < number)
			{
				maxTwo = number;
			}
		}
		System.out.println("First Max Number==> "+ maxOne +" Second Max Number==> "+maxTwo);
	}
	public static void main(String[] args) {
		int[] input = {12, 34, 78, 99, 45, 06, 53, 100};
		printTwoMaxNum(input);
	}
}
