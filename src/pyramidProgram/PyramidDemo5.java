package pyramidProgram;

public class PyramidDemo5 {
	/**
	 * 		   8
	 *		  888
	 *		 88888
	 *		8888888
	 */
	public static void main(String[] args) {
		int limit =5;
		for(int i=1;i<=limit;i++) {
			for(int space = 1; space<=limit-i;space++) {
				System.out.print("  ");
			}
			for(int j=1 ; j<=2*i-1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
