package functional_program;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int n,m;
			m=n=0;
			
			System.out.println("Enter the value of row:");
			m=sc.nextInt();
			System.out.println("enter the value of column:");
			n=sc.nextInt();
			System.out.println("Enter the element of array:");
			int a[][]=new int [5][5];
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Array element:");
			
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}
}
