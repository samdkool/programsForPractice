package programs.interview;

// Two different ways to reverse words in a sentence

public class WordReverseInSendence {
	
	//Word Reverse using String Builder
	
	public String getReverseWords(String input)
	{
		String[] words = input.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i=words.length-1;i>=0;i--)
		{
			sb=sb.append(words[i]).append(" ");
		}
		return sb.toString();
	}
	
	//Word reverse using iteration
	
	public String getReverseWords2(String input)
	{
		String[] words = input.split(" ");
		String reverse = "";
		for(int i=words.length-1;i>=0;i--)
		{
			reverse+=words[i]+" ";
		}
		return reverse;
	}
	
	public static void main(String[] args) {
		WordReverseInSendence w = new WordReverseInSendence();
		System.out.println(w.getReverseWords("I love India"));
		System.out.println(w.getReverseWords2("I love India"));
	}
}
