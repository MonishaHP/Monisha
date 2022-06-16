package oops;
class india {

	void country() {
		System.out.println("Indis is my country");
	}
}
class AP{
	void country() {
		System.out.println("AP is in India");
	}
}
class TN{
	void country() {
		System.out.println("TN is in India");
	}
}
public class inherit{
	public static void main(String[] args) {
		india i = new india();
		i.country();
		TN state1 = new TN();
		state1.country();
		AP state2 = new AP();
		state2.country();
	}
}
