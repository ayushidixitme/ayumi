import java.util.*;
public class issorted {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int t = 0;
        while (t < n) {
            ar[t] = sc.nextInt();
            t++;
        }
        boolean res= isSorted(ar,0);
        System.out.println(res);
    }

    public static boolean isSorted(int arr[],int i) {
        if(i==arr.length-1)
             return true;
        if (arr[i] >arr[i+1]) {
            return false;
        }
        boolean res=isSorted(arr,i+1);


        return res ;
    }
}



