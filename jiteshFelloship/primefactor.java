package brizlab;
import java.util.Scanner;
public class primefactor {
	
	
		public boolean prime(int a)
		{
			boolean flag=true;
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
				{
				flag=false;
				break;	
				}
				
			}
			return flag;
		}
	
		public static void main(String args[])
		{
		
			Scanner sc=new Scanner(System.in);
			primefactor f=new primefactor();
			
			System.out.println("Number to find prime factor");
			int n=sc.nextInt();
			int i=2;
			
			while(i!=n)
			{ 
				for(int j=2;j<=n;j++)
				{
					if(f.prime(i)==true && f.prime(j)==true)
							{
								if(i*j==n)
								{
									System.out.println("two prime factor are "+i+" and "+j);
								}
						
							}
				}
			
			i++;
			}	
			
			
			
		}
	}


