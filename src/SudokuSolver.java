import java.util.HashSet;

/**
 * Created by Kartik Patodi on 18-Feb-17.
 **/

public class SudokuSolver
{
    private static boolean check(int board[][])
    {
        HashSet<Integer> seen = new HashSet<>();
        for(int k = 0; k < 9; k++)
        {
            seen.clear();
            for(int i = 0; i < 9; i++)
            {
//                for(int j = 0; j < 9; j++)
//                {
                    if(seen.contains(board[k][i]))
                    {
                        return false;
                    }
                    else
                    {
                        seen.add(board[i][k]);
                    }
//                }
            }
        }
        return true;
    }

    public static void main(String[] args)
    {

    }
}
