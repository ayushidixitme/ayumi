package LinkedListaa;

import java.util.Scanner;

public class kthelementfromlast {


        private class Node {
            int data;
            Node next;

            Node(int data,Node next) {
                this.data = data;
                this.next = next;
            }
        }

        int size;
        Node head;
        Node tail;

        public kthelementfromlast() {
            // TODO Auto-generated constructor stub
            this.size = 0;
            this.head = null;
            this.tail = null;
        }

        public kthelementfromlast(Node head,Node tail, int size) {
            // TODO Auto-generated constructor stub
            this.size = size;
            this.head = head;
            this.tail = tail;
        }

        // 0(1)
        public int size() {
            return this.size;
        }

        // const
        public boolean isEmpty() {
            return this.size() == 0;
        }

        // const
        public void addFirst(int data) {
            Node node = new Node(data, this.head);
            this.head = node;

            if (this.isEmpty()) {
                this.tail = node;
            }

            this.size++;
        }

        // const because of tail
        public void addLast(int data) {
            Node node = new Node(data, null);

            if (this.isEmpty()) {
                this.tail = node;
                this.head = node;
            } else {
                this.tail.next = node;
                this.tail = node;
            }

            this.size++;
        }

        // n
        private Node getNodeAt(int idx) throws Exception {
            if (idx < 0 || idx >= this.size) {
                throw new Exception("Invalid Index");
            }

            int counter = 0;
            Node temp = this.head;

            while (counter < idx) {
                temp = temp.next;
                counter++;
            }

            return temp;
        }
    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }

    }
    public int KthNodeFromEnd(int k) throws Exception {
        if (k <= 0 || k > this.size) {
            throw new Exception("Invalid K");
        }

        Node slow = this.head;
        Node fast = this.head;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow.data;
    }
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub


        kthelementfromlast list1 = new kthelementfromlast();
        int t = scn.nextInt();
        if (t>0)
            list1.addFirst(t);
        while (t >= 0) {
            t = scn.nextInt();
            if(t==-1)
                break;
            else
                list1.addLast(t);

        }
        int k = scn.nextInt();
        k=list1.KthNodeFromEnd(k);
        System.out.println(k);


        }

    }


