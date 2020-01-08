package algorithm;

public class PrimeRange {
	public boolean checkprime(int n)
	{
		boolean flag=false;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
				break;
			}
			
		}
	return flag;	
	}
	public int reverse(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int temp=n%10;
			sum=sum*10+temp;
			n=n/10;
		}
		return sum;
	}
	public static void main(String args[])
	{
		PrimeRange p=new PrimeRange();
		
		int t=0;
		int j=0;
		int ar[]=new int[168];
		for(int i=2;i<=1000;i++)
		{
			if(p.checkprime(i)==false)
			{
				System.out.println(i);
				ar[j]=i;
				j++;
			}
		}
		int pa=0;
		System.out.println("prime palindrome");
		System.out.println("Total count:"+j);
		
			for(int  i=0;i<ar.length;i++)
			{
				if(ar[i]==p.reverse(ar[i]))
					{
						System.out.println(ar[i]);
						pa++;
					}
			}
			
		
		System.out.println("Total count:"+pa);
		
	}
}
