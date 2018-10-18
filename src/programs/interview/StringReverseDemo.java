package programs.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

//Different ways to reverse String

public class StringReverseDemo {

	//String Reverse using charArray or by iteration
	
	public String strRev1(String input)
	{
		String reverse="";
		char[] ch=input.toCharArray();
		for(int i = ch.length-1;i>=0;i--)
		{
			reverse+=ch[i];
		}
		return reverse;
	}
	
	//String reverse using String buffer and string builder
	
	public String strRev2(String input)
	{
		StringBuffer sb= new StringBuffer(input);
		sb.reverse();
		return sb.toString();
	}
	
	public String strRev3(String input)
	{
		StringBuilder sb = new StringBuilder(input);
		sb.reverse();
		return sb.toString();
	}
	
	//String reverse using collection
	
	public void strRev4(String input)
	{
		String reverse="";
		char[] ch = input.toCharArray();
		List<Character> lt = new ArrayList<>();
		for(char c:ch)
		{
			lt.add(c);
		}
		Collections.reverse(lt);
		ListIterator l = lt.listIterator();
		while (l.hasNext()) 
		{
			//System.out.print(l.next());
			reverse+=l.next();
		}
		System.out.println();
		System.out.println(reverse+" ola ho ola");
	}
	
	//String reverse using swapping
	
	public void strRev5(String input)
	{
		String reverse="";
		char[] temporary = input.toCharArray();
		int left,right;
		right=temporary.length-1;
		for(left=0;left<right;left++,right--)
		{
			char temp=temporary[left];
			temporary[left]=temporary[right];
			temporary[right]=temp;
		}
		for(char c:temporary)
		{
			System.out.print(c);
			reverse+=c;
		}
		System.out.println();
		System.out.println(reverse+" jai ho");
	}
	
	//String reverse using recursion 
	
	public String strRev6(String input)
	{
		String reverse="";
		if(input.length()==1)
		{
			return input;
		}
		else
		{
			reverse+=input.charAt(input.length()-1)+strRev6(input.substring(0, input.length()-1));
		}	
		return reverse;
	}
	
	public static void main(String args[])
	{
		StringReverseDemo d = new StringReverseDemo();
		System.out.println(d.strRev1("I love India"));
		System.out.println(d.strRev2("I love India"));
		System.out.println(d.strRev3("I love India"));
		d.strRev4("I love India");
		d.strRev5("I love India");
		System.out.println(d.strRev6("I love India"));
	}
}