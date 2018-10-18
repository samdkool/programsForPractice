package pyramidProgram;

public class PyramidDemo6 {
	public static void main(String[] args) {
		int limit = 5;
		for (int i = limit; i>=1; i--) {
			for (int space = limit - i;space>=1 ;space--) {
				System.out.print("  ");
			}
			for (int j=2*i-1; j>=1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
