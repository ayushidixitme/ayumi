import java.util.*;
public class magicalpark2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        boolean flag = true;
        String name[][] = new String[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                name[i][j] = sc.next();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (s < k) {
                    flag = false;
                    break;
                }
                if (name[i][j].equals("."))
                    s = s - 2;
                else if (name[i][j].equals("*"))
                    s = s + 5;
                else
                    break;
                if (j != m - 1)
                    s--;
            }
        }
            if (flag) {
                System.out.println("Yes");
                System.out.println(s);
            } else
                System.out.println("No");

    }
}
