
public class $PalindromeNumber {
	
	public static int checkPalindrome(int num)
	{
		int reverse=0;
		int reminder;
		while(num>0)
		{
			reminder=num%10;
			reverse=(reverse*10)+reminder;
			num=num/10;
			
			
		}
		return reverse;
		
	}

	public static void main(String[] args) {
		int num=1234543225;
		System.out.println(num);
		System.out.println(checkPalindrome(num));

	}

}
