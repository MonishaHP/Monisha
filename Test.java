public class Test
{
	public int x;
	private Test(int x)
	{
		this.x = x;
	}
	public static Test getObject(int x)
	{
		return new Test(x);
	}
}
class Main 
{
	public static void main(String[] args) 
	{
		//Test t = new Test(10); we cannot create a object for Test since it is an private constructor

		Test t1 = Test.getObject(10);
		System.out.println(t1.x);

		Test t2 = Test.getObject(100);
		System.out.println(t2.x);

		Test t3 = Test.getObject(1000);
		System.out.println(t3.x);
	}
}
