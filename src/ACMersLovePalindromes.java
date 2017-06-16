import java.util.Scanner;

/**
 * Created by Kartik Patodi on 14-Dec-16.
 **/

public class ACMersLovePalindromes
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc =  new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        if(n==1)
            System.out.println("Lovely string");
        boolean f = true;
        for (int i = 0; i < n/2; i++)
        {
                if(s.charAt(i)==s.charAt(n-1-i))
                    continue;
                else
                {
                    f=false;break;
                }
        }
        if(f)
            System.out.println("Lovely string");
        else
            System.out.println("Poor ACMers");
    }
}
