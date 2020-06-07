import java.util.*;
public class helpramu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while((t--)>0)
        {
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            int c3=sc.nextInt();
            int c4=sc.nextInt();
            int n=sc.nextInt();
            int m=sc.nextInt();
            int rick[]=new int[n];
            int cab[]=new int[m];
            for(int i=0;i<n;i++)
                rick[i]=sc.nextInt();
            for(int i=0;i<m;i++)
                cab[i]=sc.nextInt();
            int rickcost=0,cabcost=0;
            for(int i=0;i<n;i++)
                rickcost+=((c1*rick[i])<c2)?(c1*rick[i]):c2;
            rickcost=(rickcost<c3)?rickcost:c3;
            for(int i=0;i<m;i++)
                cabcost+=((c1*cab[i])<c2)?(c1*cab[i]):c2;
            cabcost=(cabcost<c3)?cabcost:c3;
            int fa=(c4<(rickcost+cabcost))?c4:(rickcost+cabcost);
            System.out.println("Final answer "+fa);
        }

    }
}

