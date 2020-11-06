import java.util.*;
public class Q5 {

	 static boolean palindrome(int n) 
	 {
		int temp =0,p =n;
		while(n > 0)
	       {
	           temp = temp * 10 + (n%10);
	           n = (int)Math.floor(n/ 10);
	       }
	       if(temp == p)
	           return true;
	       return false;
	   }
	   static int largest_palindrome()
	   {
	       int largest = 0;
	       for(int i = 100; i <= 999; i++)
	       {
	           for(int j=100; j<=999; j++)
	           {
	               int g = i * j;
	               if(palindrome(g) && (g > largest))
	                   largest = g ;
	           }
	       }
	       return largest;
	   }

	   public static void main (String[] args) 
	   {
	   	int answer = largest_palindrome();
	   	System.out.println(answer);
	   }
	}