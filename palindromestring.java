import java.util.*;
public class palindromestring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i;
        int n = s.length();
        String p = "";
        for (i = 0; i < n; i++) {
            char ch = s.charAt(i);
            p = ch + p;
        }
        if (s.equals(p))
            System.out.println("true");
        else
            System.out.println("false");
    }
}



