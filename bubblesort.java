import java.util.*;
class bubblesort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sal[] = new int[n];
        for (int i = 0; i < n; i++) {
            sal[i] = sc.nextInt();

        }
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < n - 1 - i; j++) {
                if (sal[j] < sal[j + 1]) {

                    int temp = sal[j];
                    sal[j] = sal[j+1];
                    sal[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.println(sal[i]);

    }
}


