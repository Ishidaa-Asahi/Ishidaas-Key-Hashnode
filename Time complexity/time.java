package mini;
import java.lang.System;
public class time
{
    public static void main(String[] args)
    {
        long number = 978456912;
        int i;
        int count = 0;
        if (number<2) 
        {
            System.out.println("Not a prime");
        }
        long start = System.nanoTime();
        for (i = 2; i < number; i++)
        {
            if (number%i==0)
            {
                System.out.println(i);
                count++;
            }
        }
        long end = System.nanoTime();

        long elapsedtime = end - start;
        System.out.println("The total time of calculation:");
        System.out.println(elapsedtime+" nanoseconds");
        double seconds = (double)elapsedtime / 1_000_000_000.0;
        System.out.println(seconds+" seconds");
        System.out.println("Total no.of factors excluding 1 and "+number+":"+count);
        System.out.println("Total no.of factors including 1 and "+number+":"+(count+2));
    }
}
