/**
 * Created by Kartik Patodi on 05-Feb-17.
 **/

public class MultiplesOf3And5
{
    public int solution(int number)
    {
        int sum = 0;
        for(int i = 1; i < number; i++)
        {
            if(i % 3 == 0 || i % 5 == 0) sum+=i;
        }
        return sum;
    }
}