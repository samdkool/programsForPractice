package programs.interview;

public class ArrayPostion {

	public static void insertToArray(int value) {
		int arr[] = new int[value + 6];
		
		for (int i = 0; i < value; i++) 
		{
			if (i == (value - 1)) 
			{
				arr[i] = value;
			}
		}

		//System.out.println(arr[value]);
		//System.out.println(arr.length);
		for(int j:arr) {
			System.out.println(j);
		}
	}

	public static void main(String[] args) {
		insertToArray(5);
		//insertToArray(7);
	}

}
