package programs.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordOccurance {
	public void getOccurance(String input)
	{
		String[] words = input.split(" ");
		Map<String,Integer> map = new HashMap<>();
		for (String word : words)
		{
			if (map.containsKey(word.toLowerCase()))
			{
				map.put(word.toLowerCase(), map.get(word.toLowerCase())+1);
			}
			else
			{
				map.put(word.toLowerCase(), 1);
			}
		}
		Set<String> s = map.keySet();
		for (String word: s) 
		{
			if (map.get(word)>1)
			System.out.println(word+" "+map.get(word));
		}
	}
	public static void main(String[] args) {
		WordOccurance w = new WordOccurance();
		w.getOccurance("sam is sam is cool and so cool");
	}
}
