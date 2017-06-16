import java.util.Scanner;

/**
  *Created by Kartik Patodi on 08-Dec-16.
 **/

public class DigitProblem
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        char[] arr = s.toCharArray();
        int k=sc.nextInt();
        for(int i=0;i<s.length();i++)
        {
            if(k==0)
            {
                break;
            }
            if(arr[i]!='9')
            {
                arr[i]='9';
                k--;
            }
        }
        System.out.println(arr);
    }
}
