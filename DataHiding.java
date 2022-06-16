public class Test
{
	private int x;
	public Test(int x)
	{
		this.x=x;
	}
	public int getx()
	{
		return x;
	}
}
class DataHiding
{
	public static void main(String[] args) 
	{
		Test t1 = new Test(10);
		System.out.println(t1.getx());
	}
}
