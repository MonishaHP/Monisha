class Test
{
	public void print()
	{
		System.out.println("Hello Jspiders");
	}
}
class Demo
{
	public Test getObject()
	{
		return new Test();
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.print();

		new Test().print();
		
		Demo d = new Demo();
	    //Test t = d.getObject();
		t.print();

		//Demo d = new Demo();
		d.getObject().print();

		new Demo().getObject().print();
	}
}
