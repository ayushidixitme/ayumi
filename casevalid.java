import java.util.*;
public class casevalid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);
        int i;
        i = (int) s;
        if (Character.isUpperCase(s))
            System.out.println("U");
        else if (Character.isLowerCase(s))
            System.out.println("L");
        else
            System.out.println("I");
    }
}


