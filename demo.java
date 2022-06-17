//abstract class  
abstract class Demo {
//abstract method  
	abstract void display();
}

//extends the abstract class  
class demo1 extends Demo {
//defining the body of the method of the abstract class  
	void display() {
		System.out.println("Abstract method called.");
	}

	public static void main(String[] args) {
		demo1 obj = new demo1();
//invoking abstract method  
		obj.display();
	}
}