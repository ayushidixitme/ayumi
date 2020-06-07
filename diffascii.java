import java.util.*;
public class diffascii {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i;
        int n = s.length();
        System.out.print(s.charAt(0));
        for (i = 0; i < s.length() - 1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            int i1 = (int) ch1;
            int i2 = (int) ch2;
            int ans = i2 - i1;
            System.out.print(ans + "" + ch2);
        }
    }
}

