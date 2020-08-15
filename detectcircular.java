package LinkedListaa;
import java.util.*;
import java.util.LinkedList;

class detectcircular {

       static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        LinkedList<Integer> list1=new LinkedList<Integer>();
        int t = scn.nextInt();
        if (t>0)
            list1.addFirst(t);
        while (t >= 0) {
            t = scn.nextInt();
            if(t==-1)
                break;
            boolean u=list1.contains(t);
            if(!u)
            list1.addLast(t);

        }
        for (int f=0;f<list1.size();f++)
           System.out.print(list1.get(f)+" ");
    }
    /*public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public boolean detectCycle() {
        detectcircular.Node slow = this.head;
        detectcircular.Node fast = this.head;
        boolean c=false;
        while (slow.next != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
               c=true;

            }
        }
        return c;

    }*/
}

