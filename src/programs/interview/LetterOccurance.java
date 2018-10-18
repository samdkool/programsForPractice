package programs.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LetterOccurance {
	public static void noOFLetter(String input) {
		String[] letters = input.split("");
		Map<String, Integer> map = new HashMap<>();
		for (String s : letters) {
			if (s.equalsIgnoreCase(" ")) {
				continue;
			}
				if (map.containsKey(s.toLowerCase())) {
					map.put(s.toLowerCase(), map.get(s.toLowerCase()) + 1);
				} else {
					map.put(s.toLowerCase(), 1);
				}
			}
		
		Set<String> set = map.keySet();
		for (String letter : set) {
			if (map.get(letter) > 1) {
				System.out.println(letter + " :: " + map.get(letter));
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		noOFLetter("Ksheerasindhu shayee samanta");
	}
}
