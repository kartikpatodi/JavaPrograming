import java.util.Scanner;

/**
 * Created by Kartik Patodi on 18-03-2017.
 **/

public class FindTheMinimumNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String min = "min(int, ";
        String first = "min(int, int)";
        String closeBracket = ")";
        String result;

        if(n == 2)
        {
            System.out.println(first);
        }

        else
        {
            result = min + first + closeBracket;

            for(int i = 2; i < n - 1; i++)
            {
                result = min + result + closeBracket;
            }

            System.out.println(result);
        }

    }
}
