package brizlab;

import java.util.Scanner;

public class StringReplace {
	public static void main(String args[])
	{
		System.out.println("hello");
		Scanner sc=new Scanner(System.in);
		String name;
		int i=1;
		System.out.println("Enter User name");
		
		do
		{
			name=sc.nextLine();
			if(name.length()>3)
			{
				i=2;
				String s1;
				s1=name.replace("jitesh","jhon");
				System.out.println(""+s1);
			}
			else
			{
				System.out.println("use more then 3 character");
			}
		}while(i!=2);
		
		//System.out.println(""+name);
	
		
		
	}
}
