public class ArmStrong {
    public static int countDigit(int num)
    {
        if(num == 0)
        {
            return 1;
        }
        else
        {
            int count = 0;
            while (num > 0)
            {
                count++;
                num = num/10;
            }
            return count;
        }
    }
    public static boolean isArmStrong(int num, int count)
    {
        int temp = num, sum = 0;
        while (num > 0)
        {
            sum = sum + (int)Math.pow(num%10, count);
            num = num/10;
        }
        return sum == temp;
    }
    public static void main(String[] args)
    {
        int num =153;
        int count = countDigit(num);
        if(isArmStrong(num, count))
        {
            System.out.println(num+ "is a ArnStrong number");
        }
        else
        {
            System.out.println(num+ "is not a ArnStrong number");
        }
    }
}
