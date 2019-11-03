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
		if(age <18)
		{
			throw new NoVotingMinor("You are a MInor and not eligible for voting");
		}
	}
	public static void main(String[] Args)
	{
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter Age: ");
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
	}
}