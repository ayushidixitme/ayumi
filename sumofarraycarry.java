import java.util.*;
class sumofarraycarry {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1[] = new int[n];

        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int a2[] = new int[m];
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextInt();
        }

        int carry=0;
        ArrayList<Integer> a3=new ArrayList<Integer>();
        for (int i = n - 1, j = m - 1;i>=0||j>=0; i--, j--) {

            int sum = 0;
            sum=sum+carry;
            if (i >= 0 && j >= 0) {
                sum = sum+a1[i] + a2[j];

            }
            if (i >= 0 && j < 0) {
                sum += a1[i];


            }
            if(j>=0&&i<0) {
                sum += a2[j];

            }
            if(i<0&&j<0)
                break;

            if (sum > 9) {
              a3.add(sum%10);
              carry=sum/10;
            }
            else {
                a3.add(sum);
                carry=0;

            }
           sum=0;

        }
        if(carry>0)
            a3.add(carry);
        for (int i = (a3.size()-1); i>=0; i--)
            System.out.print(a3.get(i)+", ");
        System.out.print("END");
    }
}


