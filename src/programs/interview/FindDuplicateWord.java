package programs.interview;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateWord {

	public void findDuplicate(String inputString) {
		String[] words = inputString.split(" ");
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		for (String word : words) 
		{
			if (map.containsKey(word.toLowerCase())) 
			{
				map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
			} 
			else 
			{
				map.put(word.toLowerCase(), 1);
			}
		}
		Set<String> s = map.keySet();
		for (String word : s) 
		{
			if (map.get(word) > 1) 
			{
				System.out.println(word + " : " + map.get(word));
			}
		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		
		FindDuplicateWord f = new FindDuplicateWord();
		f.findDuplicate("ram is ram and hari is hari");
	}

}
