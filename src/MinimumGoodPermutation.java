import java.util.Scanner;

public class MinimumGoodPermutation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int i = 0;
            for(i=0;i<(n/2)*2;i=i+2){
                a[i] = i+2;
                a[i+1] = i+1;
            }
            if(n-1==i){
                a[i] = a[i-1];
                a[i-1] = n;
            }
            for(int j:a){
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}