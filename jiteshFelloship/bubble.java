package algorithm;

import java.util.Scanner;

public class bubble {
	
	public void sort(int a[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	public static void main(String args[])
	{
		bubble b=new bubble();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size:");
		int n=sc.nextInt();
		int ar[]=new int[n];
		System.out.println("enter the element of array");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		b.sort(ar,n);
		System.out.println("After sorting array:");
		for(int i=0;i<n;i++)
		{
			System.out.print("\t"+ar[i]);
		}
		
	}

}
