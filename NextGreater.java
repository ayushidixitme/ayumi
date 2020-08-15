package StackandQueue;
import java.util.*;
public class NextGreater{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        //nextgreater(arr);
        for (int i = 0; i < n; i++) {
           int m= nextGreaterr(arr,i);
           if(m==-1)
               System.out.print("-1 ");
           else
            System.out.print(arr[m]+" ");
        }

    }
        public static int nextGreaterr(int arr[], int k){
            Stack<Integer> stack = new Stack<>();
            int t = -1;
            stack.push(arr[k]);
            int i = k + 1;
            for(i=k+1;i<arr.length;i++) {
                if (!stack.isEmpty() && arr[i] > stack.peek()) {
                    int rv = stack.pop();
                    t = i;
                    break;
                }
            }
            if (t > 0)
                return t;
            else
                return -1;
    }
        /*public static void nextgreater ( int[] arr){
            Stack<Integer> stack = new Stack<>();

            stack.push(arr[0]);
            for (int i = 1; i < arr.length; i++) {
                while (!stack.isEmpty() && arr[i] > stack.peek()) {
                    int rv = stack.pop();
                    System.out.print(arr[i]+" ");
                }
                stack.push(arr[i]);
            }

            while (!stack.isEmpty()) {
                int rv = stack.pop();
                System.out.println("-1 ");
            }
        }*/
    }


