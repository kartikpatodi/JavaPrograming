import java.util.Scanner;

/**
 * Created by Kartik Patodi on 01-Jan-17.
 **/

public class NQueens
{
    private static int N;

    private static void print(int board[][])
    {
        int i, j;
        for(i = 0; i < N; i++)
        {
            for(j = 0; j < N; j++)
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("");
        }
    }

    private static boolean isAttacked(int x, int y, int board[][])
    {
        int i;
        int j;
        if(board[x][y] == 1) return true;
        for(j = 0; j < N; j++)
        {
            if(board[x][j] == 1 || board[j][y] == 1) return true;
        }
        i = x;
        j = y;
        while(i >= 0 && i < N && j >= 0 && j < N)
        {
            if(board[i][j] == 1) return true;
            i--;
            j--;
        }
        i = x;
        j = y;
        while(i >= 0 && i < N && j >= 0 && j < N)
        {
            if(board[i][j] == 1) return true;
            i++;
            j++;
        }
        i = x;
        j = y;
        while(i >= 0 && i < N && j >= 0 && j < N)
        {
            if(board[i][j] == 1) return true;
            i--;
            j++;
        }
        i = x;
        j = y;
        while(i >= 0 && i < N && j >= 0 && j < N)
        {
            if(board[i][j] == 1) return true;
            i++;
            j--;
        }
        return false;
    }

    private static boolean NQueens(int n, int board[][])
    {
        int i, j;
        if(n == 0) return true;
        for(i = 0; i < N; i++)
        {
            for(j = 0; j < N; j++)
            {
                if(isAttacked(i, j, board)) continue;

                board[i][j] = 1;

                if(NQueens(n - 1, board)) return true;

                board[i][j] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int[][] board = new int[n][n];
            N = n;
            if(NQueens(n, board))
            {
                print(board);
                System.out.println("");
            }
            else
            {
                System.out.println("Not possible");
            }
        }
    }
}