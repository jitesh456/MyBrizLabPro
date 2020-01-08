package functional_program;

import java.util.Scanner;

public class Quadratic {
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int a,b,c,delta=0;
		double x,y;
		System.out.println("Enter the value of a b c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		delta=b*b-(4*a*c);
		if(delta<0)
		{
		x=-b+Math.sqrt(-delta)/2*a;
		y=b+Math.sqrt(-delta)/2*a;
		}
		else
		{
			x=-b+Math.sqrt(delta)/2*a;
			y=b+Math.sqrt(delta)/2*a;	
		}
		System.out.println("first root of x:"+x);
		System.out.println("first root of x:"+y);
	}
}
