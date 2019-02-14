class ShapeTest
{
	public static void main(String [] args)
	{
		Shape sh=new Circle(10);
		sh.draw();
		System.out.println("Area="+sh.getArea());
		sh=new Rectangle(10,10);
		sh.draw();
		System.out.println("Area="+sh.getArea());
	}
}