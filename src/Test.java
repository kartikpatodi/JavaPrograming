import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Kartik Patodi on 30-09-2017.
 **/

public class Test
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            String str = sc.next();
            list.add(str);
        }
        int q = sc.nextInt();
        while(q-- > 0)
        {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            String s = sc.next();
            int c = 0;
            for(int i = l; i <= r; i++)
            {
                if(list.get(i).equals(s))
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}

