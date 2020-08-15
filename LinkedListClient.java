package LinkedListaa;

public class LinkedListClient {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub

        LinkedList list = new LinkedList();

        list.addFirst(1);
        //list.addFirst(5);
        //list.display();

        list.addLast(4);
        list.addLast(5);
        //list.display();

        list.addAt(1, 2);
        list.addAt(2, 3);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        list.addLast(9);
        list.addLast(10);

        list.display();
        list.evenAfterOdd();
        list.display();
        //System.out.println(list.mid());


		/*System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.getAt(3));

		list.removeFirst();
		list.display();

		list.removeLast();
		list.display();

		list.removeAt(2);
		list.display();

        list.reversePR();
        list.display();*/



    }

}