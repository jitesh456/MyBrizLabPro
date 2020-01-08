package algorithm;
import java.util.Scanner;
public class MergeSort {
	public static void main(String args[])
	{
		MergeSort m=new MergeSort();
		String array[]= {"rohit","jitesh","amir","kumar","prajakata","mangesh","durvesh"};
		
		System.out.println("list after sorting");
		m.mergeSort(array,array.length-1,0);
		for(int i=0;i<array.length;i++)
		{
			System.out.println("\t"+array[i]);
		}
	}
	public void mergeSort(String arr[],int n,int l)
	{
		
		if(l<n)
		{
			int mid=(l+n)/2;
			mergeSort(arr,mid,l);
			mergeSort(arr,mid+1,n);
			merge(arr,mid,l,n);
		}
	}
	public void merge(String arr[],int m,int l,int n)
	{
		int i,j,k;
		int n1=m-l+1;
		int n2=n-m;
		String LA[]=new String[n1];
		String RA[]=new String[n2];
		
		for( i=0;i<n1;i++)
		{
			LA[i]=arr[i+l];
		}
		for( j=0;j<n2;j++)
		{
			RA[j]=arr[j+m+1];
		}
		i=j=0;
		k=l;
		while(i<n1 && j<n2)
		{
			if(RA[j].compareTo(LA[i])>0)
			{
				arr[k]=LA[i];
				i++;
			}
			else
			{
				arr[k]=RA[j];
				j++;
			}
			k++;
		}
		while(i<n1)
		{
			arr[k]=LA[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=RA[j];
			j++;
			k++;
		}
	}

}