
class Practice1 {
	public static void main(String[] args) {
		try {
			// code that generates exception
			int divideByZero = 5 / 0;
			System.out.println("Rest of code in try block"+divideByZero);
		}

		catch (ArithmeticException e) {
			System.out.println("ArithmeticException => " + e.getMessage());
		}

		finally {
			System.out.println("This is the finally block");
		}
	}
}