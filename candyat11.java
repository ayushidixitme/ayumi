import java.util.*;
public class candyat11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        String s;
        int u=0;
        while (u<q) {
            int n = sc.nextInt();
            int t = sc.nextInt();
            int x = n;
            while (t > 0) {
                if (x % 2 == 0)
                    x = x - x / 2;

                else
                    x = x - ((x + 1) / 2);
                x = x - (x / 4);
                t--;
            }
            System.out.print(x);
        }
        u++;
    }
}

