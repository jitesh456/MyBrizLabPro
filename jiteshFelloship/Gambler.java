package Logic;

import java.util.Scanner;

public class Gambler {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int stack,goal,No,win=0;
	System.out.println("Enter the value of stack ,goal and no of time you want to play:");
	stack=sc.nextInt();
	goal=sc.nextInt();
	No=sc.nextInt();
	if(stack==0)
	{
		System.out.print("sorry tou are broke");
	}
	else
	{
		for(int i=0;i<No;i++)
		{
			stack=stack-1;
			 double temp=Math.random();
			if(temp<0.5)
			{
				stack=stack+2;
				win++;
			}
			if(stack<=goal)
			{
				System.out.println("You achived your goal");
			}
			
		}
	}
	double winpre=win*100/No;
	double losspre=(No-win)*100/No;
	System.out.println("Stack value:"+stack);
	System.out.println("Win precent:"+winpre);
	System.out.println("loss precent:"+losspre);
	}
	

}
