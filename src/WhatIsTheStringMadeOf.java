import java.util.Scanner;

/**
 * Created by Kartik Patodi on 02-Jan-17.
 **/

public class WhatIsTheStringMadeOf
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int c = 0;
        for(int i = 0; i < s.length(); i++)
        {
            switch(s.charAt(i))
            {
                case '0':c += 6;break;
                case '1':c += 2;break;
                case '2':c += 5;break;
                case '3':c += 5;break;
                case '4':c += 4;break;
                case '5':c += 5;break;
                case '6':c += 6;break;
                case '7':c += 3;break;
                case '8':c += 7;break;
                case '9':c += 6;break;
            }
        }
        System.out.println(c);
    }
}
