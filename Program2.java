class A
{
	public int x=10;
	public void print()
	{
		System.out.println("Hi");
	}
}
class B extends A
{
	public double y=10.11;
	public void print(int x)
	{
		System.out.println(x);
	}
}
class C extends B
{
	public long z=1234;
	public void disp()
	{
		System.out.println("Bye");
	}
}
class Program2 
{
	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println(a.x);
		a.print();

		System.out.println();

		B b=new B();
		System.out.println(b.x);
		b.print();
		System.out.println(b.y);
		b.print();

		System.out.println();

		C c=new C();
		System.out.println(c.x);
		c.print();
		System.out.println(c.y);
		c.print();
		System.out.println(c.z);
		c.disp();
		System.out.println(a instanceof C);
	}
}
