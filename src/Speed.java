import java.util.Scanner;

/**
 * Created by Kartik Patodi on 14-Dec-16.
 **/

public class Speed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = 1;
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (i > 0) {
                    if (a[i] <= a[i - 1]) {
                        c++;
                    } else {
                        a[i] = a[i - 1];
                    }
                }
            }
            System.out.println(c);
        }
        sc.close();
    }
}