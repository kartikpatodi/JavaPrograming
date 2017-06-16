import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Kartik Patodi on 26-Jan-17.
 **/

public class ConvolutedOperations
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> s = new Stack<>();
        int n = sc.nextInt();
        HashMap<Integer, Stack<Integer>> list = new HashMap<>();

        int c = 0;

        for(int i = 0; i < n; i++)
        {
            int op = sc.nextInt();
            if(op == 0)
            {
                s.pop();
            }
            else if(op == 1)
            {
                int p = sc.nextInt();
                s.push(p);
            }
            else
            {
                int index = sc.nextInt()+1;
                int num = sc.nextInt();
                s = list.get(index);
                Iterator it = s.iterator();
                while(it.hasNext())
                {
                    int chk = (int)it.next();
                    if(chk < num)
                    {
                        c++;
                    }
                }
                System.out.println(c);
            }
            list.put(i+1, s);
        }
    }
}
