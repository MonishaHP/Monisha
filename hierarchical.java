package oops;
class hierarchical {
     void specialization() {
       	  System.out.println("Maths & Science");
          }
}
class student1 extends hierarchical{
	void maths() {
		System.out.println("To learn maths");
	}
}
class student2 extends hierarchical{
	void science(){
		System.out.println("To learn Science");
	}
}
class inherit{
	public static void main(String[] args) {
		student2 s2 = new student2();
		s2.science();
		s2.specialization();
		student1 s1=new student1();
		s1.maths();
		s1.specialization();
	}
}
