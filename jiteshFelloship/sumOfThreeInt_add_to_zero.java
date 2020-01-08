package functional_program;

public class sumOfThreeInt_add_to_zero {
	public static void main(String args[])
	{
		int a[]= {-1,2,-1,3,-2,4,-5,6,7};
		System.out.println("sum of three integer add to zero are:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=1;j<a.length;j++)
			{
				for(int m=2;m<a.length;m++)
				{
					if(a[i]+a[j]+a[m]==0)
					{
						System.out.print(+a[i]+"\t"+a[j]+"\t"+a[m]+"\n");
					}
				}
			}
			
		}
		
		
		
	}
}
