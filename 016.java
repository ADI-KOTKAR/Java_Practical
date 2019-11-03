import java.util.*;

class MarksOutOfBoundsException extends Exception
{
	MarksOutOfBoundsException(String s)
	{
		super(s);
	}
}
class Main
{
	void check(int marks) throws MarksOutOfBoundsException
	{
		if(marks>100 || marks<0)
		{
			throw new MarksOutOfBoundsException("Invalid Marks");
		}
	}
	public static void main(String[] Args)
	{
		int m, seat_no, center_no;
		String date,name;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		name = sc.nextLine();
		System.out.println("Enter Date: ");
		date = sc.nextLine();
		System.out.println("Enter Seat_no: ");
		seat_no = sc.nextInt();
		System.out.println("Enter Center_no: ");
		center_no = sc.nextInt();
		System.out.println("Enter Marks: ");
		m = sc.nextInt();
		Main  obj = new Main();
		try
		{
			obj.check(m);
		}
		catch(MarksOutOfBoundsException e)
		{
			System.out.println("Caught in the exception.");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("\nName: "+name+"\nDate: "+date+"\nSeat_no: "+seat_no+"\nCenter_no: "+center_no+"\nMarks: "+m);
		}
	}
}