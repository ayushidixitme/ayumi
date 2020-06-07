import java.lang.*;
import java.util.*;
public class replaceallpi {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        int t = 0;
        while (t <n) {
            s = sc.next();
            Replacepi(s,"");
            t++;
        }
    }

    public static void Replacepi(String s, String res) {
        if (s.length()==0) {
            System.out.println(res);
            return;
        }

        String c;
        char ch=s.charAt(0);
        if(s.length()>1){
            c = s.substring(0, 2);
        }
        else
            c = s.substring(0, 1);

        if (("pi").equals(c))
            Replacepi(s.substring(2), res + "3.14");
        else
            Replacepi(s.substring(1), res +ch);

    }

}



