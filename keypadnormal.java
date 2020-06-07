import java.util.*;
class keypadnormal
{
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        printkeyPadCodes(s, "");
    }

    public static void printkeyPadCodes(String str, String res) {
        if (str.length() == 0) {
            System.out.println(res);
            return;
        }
        char cc = str.charAt(0);
        String ros = str.substring(1);

        String code = getcode(cc);
        for (int i = 0; i < code.length(); i++) {
            printkeyPadCodes(ros, res + code.charAt(i));
        }

    }
    public static String getcode(char cc) {
        " ", "", "", "", "", "" , "", "" , "pqrs", "wxyz"
        if (cc == '0') {
            return " ";
        }
        if (cc == '1') {
            return ".+@$";
        }
        if (cc == '2') {
            return "abc";
        }
        if (cc == '3') {
            return "def";
        }
        if (cc == '4') {
            return "ghi";
        }
        if (cc == '5') {
            return "jkl";
        }
        if (cc == '6') {
            return "mno";
        }
        if (cc == '7') {
            return "pqrs";
        }
        if (cc == '8') {
            return "tuv";
        }
        if (cc == '9') {
            return "wxyz";
        }

        return "";
    }
}
