import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Kartik Patodi on 02-Jan-17.
 **/

public class MonksLoveForFood
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Long> s = new Stack<>();
        long t = sc.nextLong();
        while(t-- > 0)
        {
            long q = sc.nextLong();
            if(q == 1)
            {
                if(s.isEmpty())
                {
                    System.out.println("No Food");
                }
                else
                {
                    long d = s.peek();
                    s.pop();
                    System.out.println(d);
                }
            }
            if(q == 2)
            {
                long n = sc.nextLong();
                s.push(n);
            }
        }
    }
}