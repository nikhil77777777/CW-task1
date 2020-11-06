import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		char ch[] = st.toCharArray();
		String s ="";
		int i=0;
		for (char c:ch)
		{
			if (c=='G')
			{
				c='C';
			}
			else if(c=='C')
			{
				c='G';
			}
			else if(c=='T')
			{
				c='A';
			}
			else if(c=='A')
			{
				c='U';
			}
		
			else
			{
				 i=1;
			break;
			
			}
				s =  ""+ s +c;
		 }
		
		if (i==0)
		{
			
				System.out.print( s);
		}
		else
		         System.out.println("invalid input");
	}

}