class Parent
{
	public int x=10;
	public void print()
	{
		System.out.println("Hi");
	}
}
class Child1 extends Parent
{
	public double y=12.11;
	public void view()
	{
		System.out.println("Bye");
	}
}
class Child2 extends Parent
{
	public char z='a';
	public int disp()
	{
		return 1;
	}
}
class Child3 extends Parent
{
	public long m=12345;
	public int show()
	{
		return 12;
	}
}
class Program1 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		System.out.println(p.x);
		p.print();
		System.out.println(p instanceof Child1);

		System.out.println();

		Child1 c1=new Child1();
		System.out.println(c1.x);
		c1.print();
		System.out.println(c1.y);
		c1.view();
		System.out.println(c1 instanceof Parent);

		System.out.println();

		Child2 c2=new Child2();
		System.out.println(c2.x);
		c2.print();
		System.out.println(c2.z);
		System.out.println(c2.disp());

        System.out.println();

		Child3 c3=new Child3();
		System.out.println(c3.x);
		c3.print();
		System.out.println(c3.m);
		System.out.println(c3.show());


	}
}
