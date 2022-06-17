import java.util.*;

class JavaExample {
	public static void main(String args[]) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Moni");
		alist.add("Nithu");
		alist.add("Lucky");
		alist.add("Sathish");
		alist.add("Citti");
		alist.add("Tom");

		// displaying elements
		System.out.println(alist);

		// Adding "Moni" at the fourth position
		alist.add(3, "Moni");

		// displaying elements
		System.out.println(alist);
	}
}