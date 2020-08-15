package LinkedListaa;

import java.util.LinkedList;
import java.util.Scanner;

public class palndrome {

    public static void main(String[] args)throws Exception {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int q;
        LinkedList<Integer> list1=new LinkedList<Integer>();
        LinkedList<Integer> list2=new LinkedList<Integer>();
        for(long p=0;p<N;p++){
            q = scn.nextInt();
            list1.addLast(q);
        }

        for(int p=N-1;p>=0;p--){
            list2.addLast(list1.get(p));
        }


            boolean t=(list1==list2)?true:false;
            System.out.println(t);


        }
}






