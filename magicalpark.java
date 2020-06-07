import java.util.*;
public class magicalpark {
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
        int i = 0, j = 0;
        while (i < n ) {
            while (flag && j < m) {

                if (name[i][j].equals(".")) {
                    if (j == m - 1) {
                        s = s - 2;
                        j = 0;
                        i++;
                    }
                    else
                        s = s - 3;
                }
                else if (name[i][j].equals("*")) {
                    if (j == m - 1) {
                        s = s + 5;
                        j = 0;
                        i++;
                    }
                    else
                        s = s +4;
                }
                else {
                    i++;
                    j = 0;
                    if (i > n-1) {
                        flag = false;
                    }
                }
                j++;
                System.out.println(s);

            }
            i++;


        }
        if (s > k)
            System.out.println("Yes");
        else
            System.out.println("No");
        System.out.println(s);
    }
}

