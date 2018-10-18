package programs.interview;

import java.util.HashSet;

public class FindDuplicateInArray {
	public void findDuplicate(int[] input) {
		int len=input.length;
		for(int i=0;i<len-1;i++) 
		{
			for(int j=i+1;j<len;j++) 
			{
				if(input[i]==input[j] && (i!=j)) 
				{
					System.out.print(input[j]);	
				}
			}
		}
	}
	// second way
	public void findDuplicate2(int[] input) {
		HashSet<Integer> s = new HashSet<>();
		for(int i:input) 
		{
			if(s.add(i)==false) 
			{
				System.out.print(i);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {6,6,8,9,9,9,9,9,8,7,6,8};
		FindDuplicateInArray d= new FindDuplicateInArray();
		d.findDuplicate2(arr);
		System.out.println();
		System.out.println("---");
		d.findDuplicate(arr);
	}
}
