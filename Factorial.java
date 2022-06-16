public class Factorial {
    public static void main(String[] args)
    {
        int num = 5;
        int a = isFactorial(num);
        System.out.println(a);
    }
    public static int isFactorial(int num)
    {
        int fact = 1;
        if(num == 0 || num == 1)
        {
            return fact;
        }
        else
        {
            for (int i = 1; i<= num; i++)
            {
                fact = fact * i;
            }
            return fact;
        }
    }
}
