package programs.interview;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
	
	// Removing duplicate from a sorted array
	
	public static int[] removeDuplicate(int[] input) {
		int i=1;
		int j=0;
		if(input.length<2)
			return input;
		while(i<input.length)
		{
			if(input[i] == input[j])
			{
				i++;
			}
			else
			{
				input[++j] = input[i++];
			}
		}
		int[] result = new int[j+1];
		for(int n=0;n<result.length;n++)
		{
			result[n] = input[n];
		}
		return result;
	}
	public static void main(String[] args) {
		int[] input= {12,12,15,22,23,24,24,45,67,78,78,90,100};
		int[] result=removeDuplicate(input);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}
}
