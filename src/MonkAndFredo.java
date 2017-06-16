import java.util.Scanner;

/**
  *Created by Kartik Patodi on 05-Dec-16.
 **/

public class MonkAndFredo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long a = sc.nextLong();
            long b=sc.nextLong();
            long d=sc.nextLong();
            int c=0;
            for (long i = 0; i < d; i++)
            {
                if((i*a+((d-i*a)/b))==d)
                {
                    c++;
                    System.out.println("i = " + i);
                }
            }
            System.out.println(c);
        }
    }
}
