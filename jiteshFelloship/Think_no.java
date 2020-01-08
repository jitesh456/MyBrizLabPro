package algorithm;

import java.util.Scanner;

public class Think_no {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int no=0;
		no=sc.nextInt();
		String ans=null;
		boolean flag=false;
		int low,mid,high;
		low=mid=high=0;
		high=no;
		System.out.println("think a no");
		
		System.out.println("mid"+mid);
		while(flag!=true)
		{	
			 mid=(high+low)/2;
			System.out.println("Is this your no:"+mid);
			ans=sc.next();
			if(ans.compareTo("yes")==0)
			{
				System.out.println("you got your no");	
				flag=true;
				break;
			}
				System.out.println("Is your no greater then: "+mid);
				String ans2;
				ans2=sc.next();
				if(ans2.compareTo("yes")==0)
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			
		}
	}

}
