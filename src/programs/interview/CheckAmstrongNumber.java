package programs.interview;

/*
 * Armstrong is like 371,
 * its 3 digit so 3*3*3+7*7*7+1*1*1==371
 */

public class CheckAmstrongNumber 
{

	public static boolean isAmstrong(int number) {
		int temp= number;
		int digit = String.valueOf(number).length();
		int div=0;
		int sum=0;
		while(temp>0)
		{
			div=temp%10;
			int product=1;
			for(int i=0;i<digit;i++) 
			{
				product *=div;
			}
			sum +=product;
			temp=temp/10;
		}
		if(sum==number) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	public static void main(String[] args) 
	{
		System.out.println(isAmstrong(371));
	}
}
