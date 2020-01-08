package algorithm;




public class InsertionSort {
	public static void main(String args[])
	{	
		InsertionSort so=new InsertionSort();
		
		String s[]= {"jitesh","amir","kumar","mangesh","durvesh"};
		
		System.out.println("list After sort:");
		so.sort(s,s.length);
		so.print(s,s.length);
	
	}
	
	public void  print(String a[],int size)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
	public void sort(String s[],int size)
	{
		for(int i=0;i<s.length;i++)
		{
			String key=s[i];
			int j=i-1;
					while(j>=0 && s[j].compareTo(key)>0)
					{
						s[j+1]=s[j];
						j=j-1;
					}
					s[j+1]=key;
			}
		}
	}
		

