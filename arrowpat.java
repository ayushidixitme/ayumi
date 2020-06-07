import java.util.*;
class arrowpat {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n/2; i++) {
            for (int j = n - 2 * i; j > 1; j--) {

                System.out.print("  ");

            }
            for (int j = i + 1; (j >= 1 && j <= n / 2 + 1); j--) {

                System.out.print(j + " ");

            }
            for (int j =1;j<=i&&i<n/2+1; j++) {

                System.out.print("  ");

            }
            for (int j=2;j<=i&&i<n/2+1; j++) {

                System.out.print("  ");

            }
            for (int j=1;i!=0&&j<=i+1&&i<n/2+1 ;j++)
            {

                System.out.print(j+" ");

            }
            System.out.println("");
        }
        for (int i = 1;i<=n/2; i++) {
            for (int j =1;j<=i*2&&i<=n/2; j++) {

                System.out.print("  ");

            }
            for (int j =n/2-i+1; j>=1; j--) {

                System.out.print(j + " ");

            }
            for (int j =n/2-i;j>=1; j--) {

                System.out.print("  ");

            }
            for (int j=n/2-1-i;j>=1; j--) {

                System.out.print("  ");

            }
            for (int j=1;j<=n/2+1-i&&i!=n/2 ;j++)
            {

                System.out.print(j+" ");

            }
            System.out.println("");
        }
    }
}
