package brizlab;
import java.util.Scanner;
public class LeapYear {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year:");
		int year;
		year=sc.nextInt();
		if(year % 400==0)
		{
			if(year % 100==0)
			{
				if(year % 4 ==0)
				{
					System.out.println("Leap year:");
				}
			}
			
		}
		else
		{
			System.out.println("Not a Leap year:");
		}
	}
}
