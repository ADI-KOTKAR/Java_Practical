package Figure;
import java.util.*;

public class Circle
{
	double radius;
	public void readData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		radius = sc.nextDouble();
	}
	public void area()
	{
		double area = Math.PI * radius * radius;
		System.out.println("Area of Circle is: "+area);
	}
}