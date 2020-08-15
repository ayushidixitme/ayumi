package StackandQueue;
import java.util.*;
public class histogram {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        long[] arr = new long[n];

        for(int i = 0;i < n;i++)
            arr[i] = s.nextLong();

        histogram mainobj = new histogram();
        StacksUsingArrays stack = mainobj.new StacksUsingArrays(1000);

        System.out.println(hist(arr, stack));
    }
    public static void reverseStack(StacksUsingArrays stack,StacksUsingArrays helper, int idx) throws Exception {
        if(stack.isEmpty()) {
            return;
        }

        int item=stack.pop();
        reverseStack(stack, helper, idx+1);
        helper.push(item);

        if(idx==0) {
            while(!helper.isEmpty()) {
                stack.push(helper.pop());
            }
        }

    }
    public static long hist(long[] arr, StacksUsingArrays stack) throws Exception {

        int i=0;
        long pArea=0,maxArea=0;
        while (i < arr.length)
        {
            if (stack.isEmpty() || arr[i] > arr[stack.top()]) {
                stack.push(i);
                i++;
            }
            else
                {
                long x = arr[stack.pop()];
                int R = i;
                if (stack.isEmpty())
                {
                    pArea = x * R;
                    maxArea = Math.max(pArea, maxArea);
                }
                else
                    {
                    int L = stack.top();
                    R = (R - L - 1);
                    pArea = x * R;
                    maxArea = Math.max(pArea, maxArea);
                }
            }
        }
        while (!stack.isEmpty()) {

            long x = arr[stack.pop()];
            int R = i;
            if (stack.isEmpty()) {
                pArea = x * R;
                maxArea = Math.max(pArea, maxArea);
            } else {
                int L = stack.top();
                R = (R - L - 1);
                pArea = x * R;
                maxArea = Math.max(pArea, maxArea);
            }
        }
        return maxArea;

    }
    private class StacksUsingArrays {
        private int[] data;
        private int tos;

        public static final int DEFAULT_CAPACITY = 10;

        public StacksUsingArrays() throws Exception {
            // TODO Auto-generated constructor stub
            this(DEFAULT_CAPACITY);
        }

        public StacksUsingArrays(int capacity) throws Exception {
            if (capacity <= 0) {
                System.out.println("Invalid Capacity");
            }
            this.data = new int[capacity];
            this.tos = -1;
        }

        public int size()
        {
            return this.tos + 1;
        }

        public boolean isEmpty() {
            if (this.size() == 0) {
                return true;
            } else {
                return false;
            }
        }

        public void push(int item) throws Exception {
            if (this.size() == this.data.length) {
                throw new Exception("Stack is Full");
            }
            this.tos++;
            this.data[this.tos] = item;
        }

        public int pop() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            this.data[this.tos] = 0;
            this.tos--;
            return retVal;
        }

        public int top() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            int retVal = this.data[this.tos];
            return retVal;
        }

        public void display() throws Exception {
            if (this.size() == 0) {
                throw new Exception("Stack is Empty");
            }
            for (int i = this.tos; i >= 0; i--) {
                System.out.println(this.data[i]);
            }

        }

    }
}


