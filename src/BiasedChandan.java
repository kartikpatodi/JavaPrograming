import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Kartik Patodi on 14-Dec-16.
 **/

public class BiasedChandan
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        int a,sum=0;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++)
        {
            a=sc.nextInt();
            if(a==0)
            {
                if(s.isEmpty())
                {
                    continue;
                }
                else
                {
                    s.pop();
                }
            }
            else
            {
                s.push(a);
            }
        }
        while(!s.isEmpty())
        {
            sum+=s.peek();
            s.pop();
        }
        System.out.println(sum);
    }
}
