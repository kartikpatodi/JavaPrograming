/**
 * Created by Kartik Patodi on 05-Feb-17.
 **/

public class PrimeDecomp
{

    public static String factors(int n)
    {
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i < Math.sqrt(n); i++)
        {
            if(isPrime(i) && n % i == 0)
            {
                sb.append("(");
                int c = 0;
                while(n % i == 0 && n > 0)
                {
                    n/=i;
                    c++;
                }
                if(c>1) sb.append(i+"**"+c);
                else    sb.append(i);
                sb.append(")");
            }
        }
        if(isPrime(n))
        {
            sb.append("("+n+")");
        }
        return sb.toString();
    }

    private static boolean isPrime(int n)
    {
        if(n < 2) return false;
        else if(n == 2 || n == 3) return true;
        else if(n % 2 == 0 || n % 3 == 0) return false;
        else
        {
            for(int i = 5; i < (int) Math.sqrt(n); i += 2)
                if(n % i == 0) return false;
        }
        return true;
    }

}