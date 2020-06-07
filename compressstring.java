import java.util.*;
public class compressstring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();int i;
        int n=s.length();
        for (i = 0; i < s.length()-1;) {
            char ch = s.charAt(i);
            int j = i;
            int count = 1;
                while (s.charAt(j + 1) == ch) {
                    count++;
                    j++;
                    i = j;
                    ch = s.charAt(i);
                    if(i==n-1)
                        break;
                }
                if (count > 1) {
                    System.out.print(ch);
                    System.out.print(count);
                    i = i + 1;
                } else {
                    System.out.print(ch);
                    i++;
                }

        }    if(s.charAt(s.length()-2)!=s.charAt(s.length()-1))
            System.out.print(s.charAt(s.length()-1));

    }
}


