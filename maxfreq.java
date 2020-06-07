import java.lang.*;
import java.util.*;
public class maxfreq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i;
        int n = s.length();
        s = s.toLowerCase();int u = 0;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for ( i = 97; i <= 122; i++) {
            for ( int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                int i1 = (int) ch;
                if (i1 == i)
                    count++;
            }
            if (count > max) {
                max = count;
                 u=i;
            }
            count = 0;
        }
        System.out.println((char)u);
    }
}

