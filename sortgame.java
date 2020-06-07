import java.util.*;
public class sortgame
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        String name[] = new String[n];
        int sal[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            name[i] = sc.next();
            sal[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (sal[j]<sal[j+1])
                {
                    int temp = sal[j];
                    sal[j] = sal[j + 1];
                    sal[j + 1] = temp;

                    String temp1 = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp1;
                }

            }
        }
        for (int i = 0; i < n-1; i++) {
            if (sal[i] == sal[i + 1]) {
                if (name[i].compareToIgnoreCase(name[i + 1]) > 0) {
                    String temp1 = name[i];
                    name[i] = name[i + 1];
                    name[i + 1] = temp1;
                }
            }
        }


        for (int i = 0; i < n&&sal[i]>=s; i++)
        {
            System.out.println(name[i]+" "+sal[i]);
        }
    }
}







