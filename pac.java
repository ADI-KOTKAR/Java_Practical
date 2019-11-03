import Figure.Circle;
import Figure.Square;
class pac
{
	public static void main(String[] Args)
	{
		Circle c= new Circle();
		c.readData();
		c.area();
		
		Square d = new Square();
		d.readData();
		d.area();
	}
}