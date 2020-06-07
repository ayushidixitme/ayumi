
	import java.util.*;
        class pattern6
        {
            public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                for(int i=0;i<=n;i++)
                {
                    for(int j=n;j<=n-i;j--)
                    {

                        System.out.print(j+" ");

                    }
                    for(int j=n-i;j>0;j--)
                    {

                        System.out.print("  ");

                    }
                    for(int j=n-1-i;j>0;j--)
                    {

                        System.out.print("  ");

                    }
                    if(i<n)
                    {
                        for(int j=n-i;j<=5;j++)
                        {

                            System.out.print(j+" ");

                        }
                    }
                    else
                    {
                        for(int j=1;j<=n;j++)
                        {

                            System.out.print(j+" ");

                        }
                    }


                    System.out.println("");

                }


            }

        }
