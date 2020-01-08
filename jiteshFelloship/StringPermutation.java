package algorithm;
import java.util.Scanner;
public class StringPermutation {
	static int n=0;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String fot purmutation");
		String str=sc.next();
		StringPermutation sr=new StringPermutation();
		sr.permute(str,str.length()-1,0);
	}
	public void permute(String str,int l,int s)
	{
		
		if(s==l)
		{
			n++;
			System.out.println(str+"\t"+n);
		}
		else
		{
			for(int i=s;i<=l;i++)
			{
				
				str=swap(str,s,i);
				permute(str,l,s+1);
				str=swap(str,s,i);
			}
		}
	}
	public String swap(String str,int l,int i)
	{
		char charA[]=str.toCharArray();
		char temp=charA[l];
		charA[l]=charA[i];
		charA[i]=temp;
		return String.copyValueOf(charA);
	}
}
