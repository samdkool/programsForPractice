package programs.interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {
	/*
	 * Here if input is given I LIKE LIKE PUNE Then out put should be I LIKE PUNE
	 */

	public static void removeDuplicate(String input) {
		String result = "";
		String[] words = input.split(" ");
		Set<String> s = new LinkedHashSet<>();
		for (String word : words) {
			s.add(word);
		}
		for (String word : s) {
			result += word + " ";
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		removeDuplicate("I LIKE LIKE LIKE PUNE");
	}
}
