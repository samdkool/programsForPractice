package programs.interview;

public class ArraySorting {
	public int[] getSortedArray(int[] input) {
		int size = input.length;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

				if (input[i] > input[j]) {
					int temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				} 
			}
		}
		return input;
	}

	public static void main(String[] args) {
		ArraySorting a = new ArraySorting();
		int[] arr = { 20, 60, 80, 40, 80, 90, 10 };
		arr = a.getSortedArray(arr);
		for (int result : arr) {
			System.out.println(result);
		}
	}
}
