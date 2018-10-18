package programs.interview;

/*
 * A perfect number is a positive integer that is equal to the sum of its proper positive divisors
 * 1 + 2 + 3 = = 6
*/
public class CheckPerfectNumber 
{
	public static boolean isPerfect(int number)
	{
		int sum = 0;
		for(int i = 1; i<=number/2; i++)
		{
			if(number%i==0)
				sum+=i;
		}
		if(number == sum)
			return true;
		else
			return false;
			
	}
	public static void main(String[] args) {
		System.out.println(isPerfect(7));
	}
}
