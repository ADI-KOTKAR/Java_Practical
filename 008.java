class Shape
{
	void draw()
	{
		System.out.println("This belongs to Shape");
	}
}
class Rectangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("This belongs to Rectangle");
	}
}
class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("This belongs to Circle");
	}
}
class Square extends Rectangle
{
	@Override
	void draw()
	{
		System.out.println("This belongs to Square");
	}
}
class Main
{
	public static void main(String[] Args)
	{
		Shape a = new Shape();
		a.draw();
		
		Rectangle b = new Rectangle();
		b.draw();
		
		Circle c = new Circle();
		c.draw();
		
		
		Square d  = new Square();
		d.draw();
		
		Shape m = new Square();
		m.draw();
	}	
}
