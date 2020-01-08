package algorithm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Binary_Search_word {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the word you want to search:");
		String input=sc.next();
		try {
			FileReader re=new FileReader("/home/jitesh/eclipse-workspace/brizlab/algorithm/word.txt");
			BufferedReader br=new BufferedReader(re);
			String []words=new String[10];
			String s;
		
			while((s=br.readLine())!=null)    
			{
				words=s.split(",");
			}
			Arrays.parallelSort(words);
			
			int high,mid,low;
			high=mid=low=0;
			high=words.length-1;
			
			int i=0;
			while(i!=10)
			{
					mid=high-low/2;
					if(words[mid].compareTo(input)==0){
						System.out.println("words found at:"+mid);
						break;
					}
					else
						if(words[mid].compareTo(input)==-1)
						{
							low=mid+1;
						}
						else
						{
							high=mid-1;
						}
			
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
