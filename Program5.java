//Multilevel Inheritance
class University
{
	public String uname, uloc;

	University(String uname, String uloc)
	{
		this.uname=uname;
        this.uloc=uloc;
	}
}
class College extends University
{
	public String cname, cloc;

	College(String uname, String uloc, String cname, String cloc)
	{
		super(uname, uloc);
		this.cname=cname;
		this.cloc=cloc;
	}
}
class Student extends College
{
	public String sname, sloc;
	public int sid;
	public double smarks;

	Student(String sname, String sloc, int sid, double smarks, String cname, String cloc, String uname, String uloc)
	{
		super(uname, uloc, cname, cloc);
		this.sname=sname;
		this.sloc=sloc;
		this.sid=sid;
		this.smarks=smarks;
	}

	public void printStudentDetails()
	{
		System.out.println("Student name = "+sname);
		System.out.println("Student loc = "+sloc);
		System.out.println("Student id = "+sid);
		System.out.println("Student marks = "+smarks);
		System.out.println("Student college = "+cname);
		System.out.println("College loc = "+cloc);
		System.out.println("Student University = "+uname);
		System.out.println("University = "+uloc);
	}
}
class  Program5
{
	public static void main(String[] args) 
	{
		Student s1 = new Student("Dinga","Bangalore",10,65.56,"Reva","Yelahanka","VTU","Belgaum");

		Student s2 = new Student("Ranga","Telangana",420,65.56,"Gitam","DBPura","Gitam University","Vizag");

		s1.printStudentDetails();
		System.out.println();

		s2.printStudentDetails();
	}
}
