import java.util.HashSet;
import java.util.Scanner;

public class KKandCrush
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            HashSet<Integer> set = new HashSet<>();
            while(n-- > 0)
            {
                int e = sc.nextInt();
                set.add(e);
            }

            int k = sc.nextInt();
            StringBuilder sb = new StringBuilder();
            while(k-- > 0)
            {
                int o = sc.nextInt();
                if(set.contains(o)) sb.append("Yes\n");
                else sb.append("No\n");
            }
            System.out.println(sb.toString());
        }
    }
}
