import java.util.*;
class selectionsort{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sal[] = new int[n];
        for (int i = 0; i < n; i++) {
            sal[i] = sc.nextInt();

        }
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (sal[j] < sal[min]) {
                    min = j;
                }
            }
            int temp = sal[min];
            sal[min] = sal[i];
            sal[i] = temp;
        }
        for (int i = 0; i < n; i++)
            System.out.println(sal[i]);

    }
}

