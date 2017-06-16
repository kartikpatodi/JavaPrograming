import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Kartik Patodi on 14-Dec-16.
 **/

public class NiceArches
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(),count=0;
        while(t-->0)
        {
            Stack<Character> s = new Stack<>();
            s.push('0');
            String str = sc.next();
            for(int i=0;i<str.length();i++)
            {
                char c = str.charAt(i);
                char chk = s.peek();
                if(chk!=c)
                {
                    s.push(c);
                }
                else
                {
                    s.pop();
                }
            }
            if(s.peek()=='0')
            {
                count++;
                //System.out.println("t = " + t);
            }
        }
        System.out.println(count);
    }
}
