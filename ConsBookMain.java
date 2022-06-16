public class ConsBookMain {
    public static void main(String[] args)
    {
        ConsBook b1 = new ConsBook("Computer Science","Murgan",180);
        System.out.println("Book Name="+b1.name);
        System.out.println("Book Author="+b1.author);
        System.out.println("Book Price="+b1.price);

        System.out.println();

        ConsBook b2 = new ConsBook();
        System.out.println("Book Name="+b2.name);
        System.out.println("Book Author="+b2.author);
        System.out.println("Book Price="+b2.price);
    }
}
