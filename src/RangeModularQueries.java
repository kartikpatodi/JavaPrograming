import java.util.Scanner;

/**
 * Created by Kartik Patodi on 18-03-2017.
 **/

public class RangeModularQueries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
//            System.out.print(a[i]+" ");
        }
//        System.out.println();

        for(int i = 0; i < q; i++)
        {
            int left = sc.nextInt();
            int right = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int c = 0;

            for(int j = left; j <= right; j++)
            {
//                System.out.printf("%d mod %d = %d  ", a[j], x, (a[j] % x));
//                System.out.println("y = " + y);
                if(a[j] % x == y)
                {
                    c++;
                }
            }
            System.out.println(c);
        }
    }
}
