package programs.interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintSufixNPrifixOfDuplicate {
	public static void main(String[] args) {
		System.out.println("main main");
		printsufixAndPrefix("llttereeeressaaa");
	}

	public static void printsufixAndPrefix(String input) {
		char[] letters = input.toCharArray();
		Set<Character> s = new LinkedHashSet<>();
		for (int i = 0; i < letters.length; i++) {
			int j = i;
			int k = i;
			if (s.add(letters[i]) == false) {
				if (++k < letters.length) {
					System.out.println(letters[--j] + "::" + letters[k]);
				} else {
					System.out.println(letters[--j] + ":: no sufix last element");
				}
			}
		}
	}
}
