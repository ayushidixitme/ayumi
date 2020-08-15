package LinkedListaa;
import java.util.*;
class merge{

    private class Node {

        int data;
        Node next;
    }

    private Node head;
    private Node tail;
    private int size;

    public int getFirst() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return head.data;
    }

    public int getLast() throws Exception {
        if (this.size == 0)
            throw new Exception("linked list is empty");

        return tail.data;
    }

    public void addLast(int item) {
        // create a new node
        Node nn = new Node();

        nn.data = item;
        nn.next = null;

        // update summary
        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else

        {
            this.tail.next = nn;
            this.tail = nn;

            size++;
        }

    }

    public void addFirst(int item) {
        Node nn = new Node();
        nn.data = item;
        nn.next = null;

        if (size == 0) {
            this.head = nn;
            this.tail = nn;
            size++;
        } else {
            nn.next = this.head;
            this.head = nn;
            size++;
        }

    }

    public int removeFirst() throws Exception {
        Node fn = this.head;

        if (this.size == 0)
            throw new Exception("linked list is empty");

        if (this.size == 1) {
            this.head = null;
            this.tail = null;
            size = 0;
        } else {
            Node np1 = this.head.next;
            this.head = np1;
            size--;
        }

        return fn.data;
    }
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        int t = scn.nextInt();

        while(t > 0){

            merge list1 = new merge();
            int n1 = scn.nextInt();

            for (int j = 0; j < n1; j++) {
                int item = scn.nextInt();
                list1.addLast(item);
            }

            merge list2 = new merge();
            int n2 = scn.nextInt();

            for (int j = 0; j < n2; j++) {
                int item = scn.nextInt();
                list2.addLast(item);
            }
            list1.merge_sorted_list(list2);
            t--;
        }

    }

    public void merge_sorted_list(merge list2) throws Exception {
        Node temp1 = this.head;
        Node temp2 = list2.head;

        merge ans = new merge();

        while (temp1 != null && temp2 != null) {
            if (temp1.data < temp2.data) {
                ans.addLast(temp1.data);
                temp1 = temp1.next;
            } else {
                ans.addLast(temp2.data);
                temp2 = temp2.next;
            }
        }

        while (temp1 != null) {
            ans.addLast(temp1.data);
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            ans.addLast(temp2.data);
            temp2 = temp2.next;
        }

        Node temp3 = ans.head;
        while (temp3 != null) {
            System.out.print(temp3.data + " ");
            temp3 = temp3.next;
        } }

    public void display() {

        Node temp = this.head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }


}

