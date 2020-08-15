package StackandQueue;
public class Stackusingarrayclient {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        stackusingarrays stack = new stackusingarrays(5);

        for (int i = 1; i <= 5; i++) {
            stack.push(i * 10);
            stack.display();
        }
        stack.pop();
        stack.display();
    }
}

