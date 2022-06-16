//constructor calling
class Test
{
	Test()
	{
		this(12.23);
		System.out.println("no-arg constructor");
	}
	Test(int x)
	{
		this();
        System.out.println("int-arg constructor");
	}
	Test(double y)
	{
		this(12,12.23);
		System.out.println("double-arg constructor");
	}
	Test(int x,double y)
	{
		System.out.println("int/double-arg constructor");
	}
}
class Program4
{
	public static void main(String[] args) 
	{
		new Test(21);
		System.out.println();

		new Test();
	}
}
