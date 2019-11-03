package Figure;

import java.util.*;

public class Square
{
	double side;
	public void readData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side: ");
		side = sc.nextDouble();
	}
	public void area()
	{
		double area = side*side;
		System.out.println("Area of Square is: "+area);
	}
}