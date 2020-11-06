import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String input = sc.nextLine();
		String date="",month="",year="";
		String s[]=input.split(" ",3);
		date = s[0].replaceAll("st", "").replaceAll("nd", "").replaceAll("rd", "").replaceAll("th", "");
		month = s[1].toLowerCase();
		year = s[2];
		int D=0;
		int d=Integer.parseInt(date);
		int y=Integer.parseInt(year);
	
		int flag=0;
		if(((y%4 == 0) && (y%100!= 0)) || (y%400 == 0)) {
			flag++;
		}
		if(month.equals("january")) {
				D = d;
				System.out.println(d);
			}
		else if (month.equals("february")) {
			if(flag==0) 
				D=31+d;
			else 
				D=32+d;
		}
		else if(month.equals("march")) {
			if(flag==0)
				D=59+d;
			else
				D=60+d;
		}
		else if(month.equals("april")) {
			if(flag==0)
				D=89+d;
			else
				D=90+d;
		}
		else if(month.equals("may")) {
			if(flag==0)
				D=120+d;
			else
				D=121+d;
		}
		else if(month.equals("june")) {
			if(flag==0)
				D=150+d;
			else
				D=151+d;
		}
		else if (month.equals("july")) {
			if(flag==0)
				D=181+d;
			else
				D=182+d;
		}
		else if (month.equals("august")) {
			if(flag==0)
				D=212+d;
			else
				D=213+d;
		}
		else if (month.equals("september")) {
			if(flag==0)
				D=242+d;
			else
				D=243+d;
		}
		else if (month.equals("october")) {
			if(flag==0)
				D=273+d;
			else
				D=274+d;
		}
		else if (month.equals("november")) {
			if(flag==0)
				D=303+d;
			else
				D=304+d;
		}
		else if (month.equals("december")) {
			if(flag==0)
				D=334+d;
			else
				D=335+d;
			
		}
			System.out.println(D);
	

	}

}