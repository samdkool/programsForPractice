package programs.interview;

/*
 * A prime number (or a prime) is a natural number greater than 1 
 * that has no positive divisors other than 1 and itself
*/

public class CheckPrimeNumber {
	public static boolean isPrime(int number)
	{
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(isPrime(7));
	}
}
