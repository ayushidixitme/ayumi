package LinkedListaa;
import java.util.*;
import java.util.LinkedList;
public class kreverse {

        public static void main(String[] args)throws Exception {
            Scanner scn = new Scanner(System.in);
            int N = scn.nextInt();
            int k = scn.nextInt();
            int q;
            LinkedList<Integer> list1=new LinkedList<Integer>();
            for(long p=0;p<N;p++){
                q = scn.nextInt();
                list1.addLast(q);
            }

            q=1;
            int g=0;
            int p=0;
            while (q<N/k+1) {
                g=k*(q);
                int left = p, right =g-1;
                while (left <=right) {

                    int temp = list1.get(left);
                    int  l = list1.get(right);
                    list1.set(left,l);
                    list1.set(right,temp);
                    left++;
                    right--;
                }
                q++;
                p=(q-1)*k;

            }

            for (int f=0;f<list1.size();f++)
                System.out.print(list1.get(f)+" ");

        }
    }




