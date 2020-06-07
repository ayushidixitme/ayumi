import java.lang.*;
import java.util.*;
public class cbnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s;
        String p = "";
        int count = 0;
        s = null;
        while (s==null||s.length()!=n){
            s = sc.next();
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                p = p + ch;

                int p1 = Integer.parseInt(p);

                System.out.print(p1+" ");
                System.out.println(iscb(p1));
                if (iscb(p1)) {
                    count++;
                    s = s.substring(j+1);
                    System.out.println(s);
                    j=0;
                    i=0;
                }

            }
            p="";
        }
        System.out.println(count);
    }

        public static boolean iscb( int num){

            int arr[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

            boolean iscb1 = true;
            for (int i = 0; i < arr.length; i++) {
                if(num==1||num==0){
                    iscb1=false;
                break;
            }
                else if (num == arr[i])
                    iscb1 = true;

                else if (num % arr[i] == 0) {
                    iscb1 = false;
                    break;
                }
            }
            return iscb1;
        }
    }



