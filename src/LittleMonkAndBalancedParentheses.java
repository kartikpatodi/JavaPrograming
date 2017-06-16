import java.util.Scanner;
import java.util.Stack;

/**
  *Created by Kartik Patodi on 12-Dec-16.
 **/

public class LittleMonkAndBalancedParentheses
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),result=0;
        int[] a = new int[n];
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            if(a[i]>0)
            {
                s.push(i);
            }
            else
            {
                int index = s.peek();
                s.pop();
                if(a[index]==(-a[i]))
                {
                    if(!s.isEmpty())
                    {
                        result = Math.max(result,i-s.peek());
                    }
                    else
                    {
                        s.push(i);
                    }
                }
                else
                {
                    s.push(i);
                }
            }
        }
        System.out.println(result);
    }
}
