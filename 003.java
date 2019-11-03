import java.util.*;

class Box
{
	double length=0;
	double breadth=0;
	double height=0;
	
	Box()
	{
		System.out.println("Empty Box");
	}
	Box(double l, double b, double h)
	{
		this.length = l;
		this.breadth = b;
		this.height = h;
		System.out.println("\tLength: "+length+"\tBreadth: "+breadth+"\tHeight: "+height);
	}
	Box(double s)
	{
		this.length = s;
		this.breadth = s;
		this.height = s;
		System.out.println("\tLength: "+length+"\tBreadth: "+breadth+"\tHeight: "+height);
	}
	void volume()
	{
		double vol = length*breadth*height;
		System.out.println("\n Volume: "+vol);
	}
	void readData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter sides:");
		this.height=sc.nextInt();
		this.breadth=sc.nextInt();
		this.length=sc.nextInt();
	}
}
class Main
{
	public static void main(String[] Args)
	{
		Box obj1 = new Box();
		obj1.readData();
		obj1.volume();
		Box obj2 = new Box(2);
		obj2.volume();
		Box obj3 = new Box(1,2,3);
		obj3.volume();
		
	}
}