import java.util.Scanner;

public class Methods {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        m1(num);
    }
    public static void m1(int num)
    {
        if(num > 0)
        {
            System.out.println(num+"is a positive number");
        }
        else if(num < 0)
        {
            System.out.println(num+"is a negative number");
        }
        else
        {
            System.out.println(num+"is neither positive nor negative number");
        }
    }
}
