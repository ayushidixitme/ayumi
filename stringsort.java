import java.util.*;
public class stringsort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String name[] = new String[n];

        for (int i = 0; i < n; i++)
        {
            name[i] = sc.next();

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (name[j].compareToIgnoreCase(name[j + 1]) > 0)
                {

                    String temp1 = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = temp1;
                }
            }
        }
        for (int i = 0; i < n-1; i++) {
            if ((name[i].indexOf(name[i + 1]) != -1) || (name[i + 1].indexOf(name[i]) != -1)) {
                String temp1 = name[i];
                name[i] = name[i + 1];
                name[i + 1] = temp1;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(name[i]);

        }
    }
}

