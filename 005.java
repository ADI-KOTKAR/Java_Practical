class Main
{
	void checkPalindrome(int n)
	{
		int a,b,sum=0;
		b=n;
		while(n!=0)
		{
			a = n%10;
			sum  = sum*10 + a;
			n = n/10;
		}
		if(sum==b)
		{
			System.out.println("Its a Palindrone Number");
		}
		else
		{
			System.out.println("Its not a Palindrome Number");
		}
	}
	
	public static void main(String[] Args)
	{
		Main obj = new Main();
		obj.checkPalindrome(53235);
	}

}
