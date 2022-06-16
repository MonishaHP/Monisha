//constructor overloading
class Pen 
{
	public String name, colour;
	public double price;

	public Pen(){}

	public Pen(String name,String colour,double price)
	{
		this.name=name;
		this.colour=colour;
		this.price=price;
	}
	public Pen(String name,String colour)
	{
		this.name=name;
		this.colour=colour;
	}
}
class PenMain
{

	public static void main(String[] args) 
	{
		Pen p1=new Pen("Boll","Blue",50.0);
		System.out.println("Pen name="+p1.name);
        System.out.println("Pen colour="+p1.colour);
		System.out.println("Pen price="+p1.price);

        System.out.println();

		Pen p2=new Pen("Bright","Black",50.0);
		System.out.println("Pen name="+p2.name);
        System.out.println("Pen colour="+p2.colour);
		System.out.println("Pen price="+p2.price);

        System.out.println();

		Pen p3=new Pen();
		System.out.println("Pen name="+p3.name);
        System.out.println("Pen colour="+p3.colour);
		System.out.println("Pen price="+p3.price);

	}
}
