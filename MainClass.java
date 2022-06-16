class Test
{
	public int x = 10, y = 20;
} 
class Demo
{
	public void modify(Test t)
	{
		t.x = 100;
		t.y = 200;
	}
}
class MainClass 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(t.x+ " " +t.y);
		new Demo().modify(t);
        System.out.println(t.x+ " " +t.y);
	}
}
