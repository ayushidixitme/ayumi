import java.util.*;
public class Quadratic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=b*b-4*a*c;
        if(d>=0)
        {

            int r1 = (int) ((-b + Math.sqrt(d)) / 2 * a);
            int r2 = (int) ((-b - Math.sqrt(d)) / 2 * a);
            if (r2 < r1)
            {
                int temp = r1;
                r1 = r2;
                r2 = temp;
                System.out.println("Real and Distinct");
                System.out.println(r1 + " " + r2);
            }
            else if(r2>r1)
            {
                System.out.println("Real and Distinct");
                System.out.println(r1 + " " + r2);
            }
            else
            {
                System.out.println("Real and Equal");

                System.out.println(r1 + " " + r1);
            }
        }
        else
            System.out.println("Imaginary");


    }
}