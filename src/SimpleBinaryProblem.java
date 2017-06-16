import java.util.Scanner;

/**
 * Created by Kartik Patodi on 09-Dec-16.
 **/

public class SimpleBinaryProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            String a=sc.next();
            String b=sc.nextLine();
            int al= a.charAt(a.length()-1) - '0',bl= b.charAt(b.length()-1) - '0',axb=al^bl;
            if (axb==1)
                System.out.println("No");
            else
                System.out.println("Yes");
        }

    }
}
