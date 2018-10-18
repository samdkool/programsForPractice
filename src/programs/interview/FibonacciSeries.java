package programs.interview;

//different ways to find fibonacci series
public class FibonacciSeries {
	// Using While loop
	public static void printFibonacci_01() {
		int count = 20;
		int num1 = 0;
		int num2 = 1;
		int i=1;
		while(i<=count)
		{
			System.out.print(num1+" ");
			int sum = num1 + num2;
			num1=num2;
			num2=sum;
			i++;
		}
	}
	
	// Using for loop
	public static void printFibonacci_02() {
		int num1 = 0;
		int num2 = 1;
		int count = 10;
		for(int i = 1; i<count; ++i) {
			System.out.print(num1+" ");
			int sum = num1+num2;
			num1=num2;
			num2=sum;
		}
	}
	
	// Fibonacci using array
	public static void printFibonacci_03() {
		int count = 15;
		int[] fA = new int[count];
		fA[0] = 0;
		fA[1] = 1;
		for(int i=2; i<count;i++) {
			fA[i] = fA[i-1] + fA[i-2];
		}
		for(int i=1;i<count;i++) {
			System.out.print(fA[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		printFibonacci_01();
		System.out.println();
		printFibonacci_02();
		System.out.println();
		printFibonacci_03();
	}
}
