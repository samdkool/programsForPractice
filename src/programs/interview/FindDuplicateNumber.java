package programs.interview;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicateNumber {
	public static void main(String args[]) {
		List<Integer> number = new ArrayList<Integer>();
		for (int i = 1; i <= 30; i++) {
			number.add(i);
		}
		number.add(23);
		FindDuplicateNumber fn = new FindDuplicateNumber();
		
		System.out.println("Duplicate Number is =" + fn.findDuplicate(number));
	}

	public int findDuplicate(List<Integer> numbers) {
		// find the highest number
		int highestNumber = numbers.size() - 1;
		System.out.println(highestNumber);
		// find the total of the series
		int total = getSum(numbers);
		System.out.println(total);
		int duplicate = total - (highestNumber * (highestNumber + 1) / 2);
		return duplicate;
	}

	public int getSum(List<Integer> number) {
		int sum = 0;
		for (int num : number) {
			sum =+ num;
		}
		return sum;
	}
}
