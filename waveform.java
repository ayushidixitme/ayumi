import java.util.*;
class waveform {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++)
                    System.out.print(a[i][j]+", ");
            }
            else {
                for (int j = n - 1; j >=0; j--)
                    System.out.print(a[i][j]+", ");
            }
        }
        System.out.print("END");

    }
}




