import java.util.*;
class insertionsort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

            for (int i = 1; i < arr.length; i++) {
                for (int j = i; j > 0 && arr[j] < arr[j - 1]; j--) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");

    }
}


