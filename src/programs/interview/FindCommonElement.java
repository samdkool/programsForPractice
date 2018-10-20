package programs.interview;

// Finding common element between two Arrays
public class FindCommonElement {
	public static void printCommonElement(int[] arr1, int[] arr2) {
		Set<Integer> commonElements = new HashSet<>();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					commonElements.add(arr1[i]);
				}
			}
		}
		System.out.println("The common elements of both the given arrays are :: " + commonElements);
	}

	public static void main(String args[]) {
		int[] arr1 = { 11, 35, 21, 55, 66, 35, 77 };
		int[] arr2 = { 12, 44, 21, 77, 99, 55 };
		printCommonElement(arr1, arr2);

	}
}