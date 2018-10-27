package programs.interview;

public class InsertInArray {
	/*
	 * Write a program to insert a value to an existing array after a specified
	 * value For example if array is {10,30,35,50,55} Then insert the value after 35
	 * as 25 so resultant array should be {10,30,35,25,50,55}
	 */
	public static void insertIntoArray() {
		int[] array = { 10, 20, 30, 35, 50, 55 };
		int valueTobeInserted = 25;
		int[] newArray = new int[array.length + 1];

		for (int i = 0, j = 0; i < array.length; i++) {
			if (array[i] == 35) {
				newArray[j] = array[i];
				newArray[++j] = valueTobeInserted;
			} else {
				newArray[j] = array[i];
			}
			j++;
		}
		for (int k : newArray)
			System.out.println(k);
	}

	public static void main(String[] args) {
		insertIntoArray();
	}
}
