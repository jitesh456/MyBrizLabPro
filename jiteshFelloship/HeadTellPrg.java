package brizlab;
import java.util.Scanner;

public class HeadTellPrg {

	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n;
		System.out.println("Enter the no of time u want to flip coin");
		n=sc.nextInt();
		int head=0,tail=0;
		float Hpre,Tpre;
		for(int i=0;i<n;i++)
		{
			
			if(Math.random()<0.5)
			{
				head++;
			}
			else
			{
				tail++;
			}
			
			
		}
		Hpre=head*100/n;
		Tpre=tail*100/n;
		System.out.println("Head precentage:"+Hpre);
		System.out.println("Tail precentage:"+Tpre);
		
	}
	
}
