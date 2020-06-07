import java.util.*;
public class matrixsearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++)
            a[i][j] = sc.nextInt();

        }
        int s = sc.nextInt();
        int flag=0;
        for(int i=0;i<m;i++)
        {

            int h = n - 1, l = 0, mid;

            while (l <= h) {
                mid = (l + h) / 2;
                if (a[i][mid] == s) {
                    flag=1;

                    break;
                } else if (a[i][mid] < s) {
                    l = mid + 1;

                } else {
                    h = mid - 1;

                }

            }
            if(flag==1)
            {
                break;
            }

        }
        System.out.print(flag);

    }
}
