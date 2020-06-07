import java.io.*;
import java.util.Random;
class GeneratingRandomNumbers
{
    static int requiredNumbers = 5;
    static int lowerBound = 0;
    static int upperBound = 1000;
    public static void main (String[] args) throws IOException
    {
        Random random = new Random();

        for(int i = 0; i < requiredNumbers; i++)
        {
            int a = random.nextInt(upperBound - lowerBound) +
                    lowerBound;
            System.out.println(a);
        }
    }
}
