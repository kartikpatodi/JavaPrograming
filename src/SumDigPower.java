import java.util.LinkedList;
import java.util.List;

/**
 * Created by Kartik Patodi on 30-Jan-17.
 **/

public class SumDigPower
{
    public List<Long> sumDigPow(long a, long b)
    {
        List<Long> list = new LinkedList<>();

        for(long i = a; i <= b; i++)
        {
            if(powCalc(i) == i)
            {
                list.add(i);
            }
        }
        return list;
    }

    private long powCalc(long n)
    {
        long len = String.valueOf(n).length();
        long pow = 0;

        while(n > 0)
        {
            long r =  (n % 10);
            n /= 10;
            pow += Math.pow(r, len);
            len--;
        }
        return pow;
    }
}