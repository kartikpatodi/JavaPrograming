import java.util.Scanner;

/**
  *Created by Kartik Patodi on 06-Dec-16.
 **/

public class ANKTRAIN
{
    public static int seat(int x)
    {
        int n=x%8;
        if(n==1||n==2||n==3)
            return x+3;
        else if(n==4||n==5||n==6)
            return x-3;
        else if(n==7)
            return x+1;
        else
            return x-1;
    }
    public static String birth(int n)
    {
        String s="";
        switch(n)
        {
            case 0: s += "SL";break;
            case 1: s += "LB";break;
            case 2: s += "MB";break;
            case 3: s += "UB";break;
            case 4: s += "LB";break;
            case 5: s += "MB";break;
            case 6: s += "UB";break;
            case 7: s += "SU";break;
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0)
        {
            int n=sc.nextInt();
            System.out.println(seat(n)+birth((n%8)));
        }
    }
}
