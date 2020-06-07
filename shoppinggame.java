import java.util.*;
public class shoppinggame {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while ((t--) > 0) {
            int f = 0;
            long m = sc.nextLong();
            long n = sc.nextLong();
            int ayu = 0, har = 0, f1 = 0, f2 = 0, k = 1;
            while (ayu < m && har < n) {

                if (k % 2 == 0)
                    har += k;
                else
                    ayu += k;
                k++;
                if (ayu >= m)
                    f1 = 1;
                if (har >= n)
                    f2 = 1;

            }
            if (f2 == 1)
                System.out.println("Aayush");
            else if (f1 == 1)
                System.out.println("Harshit");
            else
                System.out.println("wrong");
        }
    }
}