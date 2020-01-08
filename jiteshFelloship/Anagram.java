package algorithm;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter two string:");
		char ch[]=new char[100];
		char ch1[]=new char[100];
		s1=s2=null;
		s1=sc.next();
		s2=sc.next();
		if(s1.length()!=s2.length())
		{
			System.out.println("not an anagram");
			
		}
		else
		{
			ch=s1.toCharArray();
			ch1=s2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
		
			String str=String.valueOf(ch);
			String st1=String.valueOf(ch1);
			System.out.println("\n"+str+"\t"+st1);
		
			if(str.equals(st1))
			{
				System.out.println("String s1 and s2 are anagram");
			}
			else
			{
				System.out.println("not an anagram");
			}
		}
	}

}
