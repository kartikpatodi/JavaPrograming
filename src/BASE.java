import java.io.IOException;
import java.util.Scanner;

/**
  *Created by Kartik Patodi on 06-Dec-16.
 **/

public class BASE
{
    public static boolean check(long n,long m)
    {
        long pow = (long) (Math.log(n)/Math.log(m));
      //  System.out.println("pow = " + pow);
        double c = n/Math.pow(m,pow);
        if(c>=1)
        {
            int chk = (int) (c);

            return chk == 1;
        }
        else
            return false;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            long n=sc.nextLong();
            long i,c=1;
            if(n==1)
            {
                System.out.println("INFINITY");
                continue;
            }
            if(n<11)
            {
                for (i = 3; i < 10; i++)
                {
                    if (check(n, i))
                    {
                        // System.out.println("i = "+i);
                        c++;
                    }
                }
            }
            if(n>10 )
            {
                if(check(n,3)) c++;
                if(check(n,4)) c++;
                if(check(n,5)) c++;
               for(i=6;i<=n;i++)
                {
                    if(check(n,i))
                    {
                     //   System.out.println("i = "+i);
                        c++;
                    }
                }
            }

            System.out.println(c);
        }
    }
}
