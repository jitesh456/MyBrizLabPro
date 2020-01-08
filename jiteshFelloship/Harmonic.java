package brizlab;
import java.util.Scanner;
public class Harmonic {
	public static void main(String args[])
	
	{
		Scanner sc=new Scanner(System.in);
		
		float f=0;
		float s=1;
		int n;
		System.out.println("Enter the value of n of nth harmonic no:");
		n=sc.nextInt();
	
		for(int i=0;i<n;i++)
		{
			int temp=i+1;
			f+=s/(s+i);
			System.out.println("h of "+temp+" ="+f);
		}

	}
	
}
