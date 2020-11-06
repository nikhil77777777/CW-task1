public class Q6
{
	public static boolean isPrime(int n) //prime number checking function
	{
		
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0) 
				return false;
		}
		return true;
	}
		public static  void main(String[] args)
		{
			int counter=0,i=2;
			while(true) 
			{
				if(isPrime(i))        //calling prime function to check whether a no is prime  or not.
				{
					counter++;        //counter for counting till 10001
			    }
				
				if(counter==10001) 
				{
			    System.out.println(i);
				break;
				}
				i++;
		    }
		}
 }
