import java.io.IOException;
import java.util.Scanner;

/**
  *Created by Kartik Patodi on 04-Dec-16.
 **/

public class WILLITST
{
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        long n=sc.nextLong();
        long chk=n&(n-1);
        if(chk==0)
            System.out.println("TAK");
        else
            System.out.println("NIE");
    }
}
