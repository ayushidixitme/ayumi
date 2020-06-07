import java.util.*;
public class camelcase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i;
        int n = s.length();
        String p = "";
        for (i = 0; i < s.length(); ) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                i = i + 1;
                p = p + ch;
                while ((i<n)&&Character.isLowerCase(s.charAt(i))) {
                    char ch1=s.charAt(i);
                    p = p + ch1;
                    i = i + 1;
                }
            }
            System.out.println(p);
            p = "";
        }
    }
}



