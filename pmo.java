import java.util.*;
public class pmo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while((t--)>0)
        {
            int f=0;
            long a=sc.nextLong();
            long b=sc.nextLong();
            if(a==1||a==0)
            a=2;
            for(long i=a;i<=b;i++) {
                int c = 0;
                for (long j = 2; j < i; j++) {
                    if (i % j == 0) {
                        ++c;
                        break;
                    }
                }
                if (c == 0) {
                    ++f;

                }
            }
            System.out.println(f);

        }

    }
}
//25
//168
//14
//225