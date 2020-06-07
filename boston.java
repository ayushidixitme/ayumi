import java.util.*;
public class boston
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        int sump=0,sumd=0;int c=0;
        for(int i=2;i<n;)
        {
            if(n%i==0)
            {
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        c++;
                    }
                }
                if(c==0) {
                    System.out.print(i);
                    sump += i;
                }
                else
                {
                    ++i;
                    c=0;
                }



            }
        }
        while(n>0)
        {
            sumd+=n%10;
            n=n/10;
        }
        if(sump==sumd)
            System.out.println("1");
        else
            System.out.println("0");
    }
}