import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Kartik Patodi on 11-Jan-17.
 **/

public class NameLookup
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        HashMap<Integer, String> roll = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            int rno = sc.nextInt();
            String name = sc.next();
            roll.put(rno, name);
        }
//        System.out.println(roll);
        int q = sc.nextInt();
        for(int i = 0; i < q; i++)
        {
            int rno = sc.nextInt();
            System.out.println(roll.get(rno));
        }
    }
}
