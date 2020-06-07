import java.util.*;
class cumulativesum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;int i=0,a;
        while(true)
        {
            a=sc.nextInt();
            sum+=a;
            if(sum>=0){
                System.out.println(a);
                System.out.println(sum);
            }

        }
    }
}