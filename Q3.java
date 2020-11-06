import java.util.Scanner;
public class Q3
{
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner (System.in);

    long res = 0;
    long n = 1;
    long count = 1;
    long largestCount = 0;
    long t = 0;

    for (long k = 1; k <= 999999; k++)
     {
    	n = k;
        while (n != 1) 
        {
            if ((n % 2) == 0) 
            {
                n = n / 2; 
            }
            else 
            {
                n = (3 * n) + 1;   
            }
            count = count + 1;
        }
            if (count > largestCount)
            {
                largestCount = count;
                res = k;
            }
            count = 1;
        }
    System.out.println(res);
    }
}