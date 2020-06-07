import java.util.*;
public class binarysearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

        }
        int s = sc.nextInt();
        int h = n - 1, l = 0, mid;
        int pos = -1;
        while (l <= h) {
            mid = (l + h) / 2;
            if (a[mid] == s) {
                pos = mid ;
                break;
            } else if (a[mid] < s) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }

        }
        System.out.println(pos);

    }
}
