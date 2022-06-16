public class Test1
{
	public int x;
	public static Test1 t;//refrence variable of Test type
	private Test1(int x)
	{
		this.x = x;
	}
	public static Test1 getObject(int x)
	{
		if( t == null)
		{
			t = new Test1(x);
		}
		return t;
	}
}
class Main 
{
	public static void main(String[] args) 
	{
		
		Test1 t1 = Test1.getObject(10);
		System.out.println(t1.x);//10

		Test1 t2 = Test1.getObject(100);
		System.out.println(t2.x);//10

		Test1 t3 = Test1.getObject(1000);
		System.out.println(t3.x);//10

		t1.x = 100;
        System.out.println(t2.x);//100
		System.out.println(t3.x);//100
	}
}
