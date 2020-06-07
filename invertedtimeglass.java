import java.util.*;
public class invertedtimeglass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= n - i; j--) {

                System.out.print(j + " ");

            }
            for (int j = n; j >= i + 1; j--) {

                System.out.print("  ");

            }
            for (int j = n - 1; j >= i + 1; j--) {

                System.out.print("  ");

            }
            for (int j = n - i;i!=n&&j<=n; j++) {

                System.out.print(j+" ");

            }
            for (int j=1;i==n&&j<=n; j++) {

                System.out.print(j + " ");

            }
            System.out.println("");
        }
        for (int i = n; i>0; i--) {
            for (int j = n; j>n-i ; j--) {

                System.out.print(j + " ");

            }
            for (int j=0; j<=n-i; j++) {

                System.out.print("  ");

            }
            for (int j =1; j<=n-i; j++) {

                System.out.print("  ");

            }
            for (int j =n-i+1;j<=n; j++) {

                System.out.print(j+" ");

            }

            System.out.println("");
        }


    }
}
