import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
  *Created by Kartik Patodi on 04-Dec-16.
 **/

public class ONP
{
    public static boolean isOperator(char x)
    {
        return x == '+' || x == '-' || x == '/' || x == '*' || x == '^';
    }

    public static int getVal(char a)
    {
        int val=0;
        if(a=='^')
            val=5;
        else if(a=='/')
            val=4;
        else if(a=='*')
            val=3;
        else if(a=='+')
            val=2;
        else if(a=='-')
            val=1;
        return val;
    }

    public static boolean hasHigherPreference(char a,char b)
    {
        int x = getVal(a),y=getVal(b);
        return (x>y);
    }

    public static boolean isOperand(char a)
    {
        return a >= 97 && a <= 122;
    }

    public static String compute(String input)
    {
        Stack <Character> s = new Stack<>();

        String ans="";
        for(int i=0;i<input.length();i++)
        {
            char x = input.charAt(i);
            if(isOperator(x))
            {
                while((!s.empty())&&(s.peek()!='(')&&hasHigherPreference(s.peek(),x))
                {
                    ans=ans+s.peek();
                    s.pop();
                }
                s.push(x);
            }
            else if(isOperand(x))
            {
                ans=ans+x;
            }
            else if(x=='(')
            {
                s.push(x);
            }
            else if(x==')')
            {
                while(s.peek()!='(')
                {
                    ans=ans+s.peek();
                    s.pop();
                }
                s.pop();
            }

        }
        while(!s.empty())
        {
            ans=ans+s.peek();
            s.pop();
        }
        return ans;
    }

    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            String s=sc.next();
            System.out.println(compute(s));
        }
    }
}
