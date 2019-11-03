import java.util.*;

class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String s)
	{
		super(s);
	}
}
class Main
{
	void check(int balance, int amount) throws InsufficientBalanceException
	{
		if(amount>balance)
		{
			throw new InsufficientBalanceException("Insufficient Balance");
		}
	}
	public static void main(String[] Args)
	{
		Scanner sc  = new Scanner(System.in);
		int bal, amt;
		System.out.println("Enter Balanace: ");
		bal = sc.nextInt();
		System.out.println("Enter Amount: ");
		amt = sc.nextInt();
		
		Main m = new Main();
		try
		{
			m.check(bal,amt);
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
	}
}