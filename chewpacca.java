import java.util.*;
public class chewpacca {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        long temp = t;
        long sum1 = 0, sum2 = 0;
        while (t > 0) {
             int rem = (int)(t % 10);
            if (rem >= 5)
                rem = 9 - rem;
            sum1 = sum1 * 10 + rem;
            t = t / 10;
        }
        while (sum1 > 0) {
            sum2 = sum2 * 10 + sum1 % 10;
            sum1 /= 10;
        }
        System.out.println(sum2);
    }
}
