import java.util.*;
class targetsumpairs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int a[] = new int[m];

        for (int i = 0; i < m; i++)  {
                a[i] = sc.nextInt();
            }
        int s=sc.nextInt();
        for (int i = 0; i < m ; i++) {

            for (int j = 0; j < m - 1 - i; j++) {
                if (a[j] > a[j + 1]) {

                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }


        for (int i = 0; i <m-2; i++){
            for(int k=i+1;k<m-1;k++){
                for(int j=k+1;j<m;j++){



                    if(a[i]+a[j]+a[k]==s)
                        System.out.println(a[i]+", "+a[k]+" and "+a[j]);

                }
            }
        }





    }
}







