import java.util.*;
class helprahul {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        ArrayList<Integer> a1=new ArrayList<>();
        for (int i = 0; i < n; i++) {

            a[i] = sc.nextInt();


        }
        int s = sc.nextInt();
        int k=0;

        while(k<n)
        {
        if(a[k]>a[k+1])
            break;
        k++;
        }
        for(int i=k+1;i<n;i++)
        {
            a1.add(a[i]);
        }
        for(int i=0;i<k+1;i++)
        {
            a1.add(a[i]);
        }

        int h = n - 1, l = 0, mid;
        int pos = -1;
        while (l <= h) {
            mid = (l + h) / 2;
            if (a1.get(mid) == s) {
                pos = mid ;
                break;
            }
            else if (a1.get(mid)< s)
                l = mid + 1;

            else
                h = mid - 1;


        }


        if((n-k-1)>pos&&pos>-1)
        pos=pos+k+1;
        else if(((n-k-1)<=pos)&&pos>-1)
         pos=pos+k-n+1;
        else
            pos=-1;
        System.out.println(pos);

    }
}

