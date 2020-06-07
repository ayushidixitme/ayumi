import java.util.*;
public class subse{
    static ArrayList<String> list = new ArrayList<String>();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        int t = 0;
        while (t < n) {
            s = sc.next();
            printSS(s,"");
            Collections.sort(list);
            for(int i=0;i<list.size();i++)
                System.out.println(list.get(i));
            list=new ArrayList<String>();
            t++;
        }


    }
    public static void printSS(String s,String res) {

        if (s.length() == 0) {
            list.add(res);
            return;
        }
        char ch = s.charAt(0);
        String t = s.substring(1);
        printSS(t, res);
        printSS(t,res + ch);

    }
}



