import java.util.*;

class NoVotingMinor extends Exception
{
	NoVotingMinor(String s)
	{
		super(s);
	}
}
class Main
{
	void check(int age) throws NoVotingMinor
	{
		if(age<18)
		{
			throw new NoVotingMinor("You are not eligible for voting as you are a MINOR.");
		}
	}
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Entre age: ");
		a = sc.nextInt();
		Main m = new Main();
		try
		{
			m.check(a);
		}
		catch(NoVotingMinor e)
		{
			System.out.println("Caught the Exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("\n Check complete");
		}
	}
	
}