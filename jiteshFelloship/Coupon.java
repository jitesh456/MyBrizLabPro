package Logic;
import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Coupon {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int NoOfCoupon;
		int n;
		int count=0;
		int count1=0;
		System.out.println("Enter the no of coupon you want to generate:");
		NoOfCoupon=sc.nextInt();
		ArrayList<Integer> l1=new ArrayList<>(NoOfCoupon);
		
		while(count1!=NoOfCoupon)
		{
		Random r=new Random();
		n=r.nextInt(20);
		count++;
		if(l1.isEmpty()==true)
		{
			l1.add(n);
			count1++;
		}
		else
		{
			if(l1.contains(n)==false)
			{
				l1.add(n);
				count1++;
			}
			
		}
		}
		System.out.println("coupon no:"+l1);
		System.out.println("no of random no:"+count);
		
	}
}
