package jitesh;
import java.util.Scanner;
public class Queue {
 static int Rear=-1,Front=-1;
 static int arr[]=new int[5]; 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String ans;
		do {
				
				System.out.print("plz select the operation u want to perform:");
				System.out.print("1.Enqueue");
				System.out.print("2.Dequeue");
				System.out.print("3.Display\t");
				int op=sc.nextInt();
				switch(op)
				{
					case 1:
						System.out.print("Enter the data you want to enqueue\t");
						int data=sc.nextInt();
						Enqueue(data);
						break;
					case 2:
						Dequeue();
						break;
					case 3:
						Display();
						break;
					default:
						System.out.print("plz select valid option:");
						break;
			
			
				}
				System.out.print("\ndo u want to perform more operation");
				ans=sc.next();
		}while(ans.compareTo("yes")==0);	
	}
	static void Enqueue(int data)
	{
		if(Rear==-1 && Front==-1)
		{
			Rear=Rear+1;
			Front=Front+1;
			arr[Rear]=data;
		}
		else if(Rear!=arr.length-1)
		{
			Rear++;
			arr[Rear]=data;
		}
		else
		{
			System.out.print("Queue is full");
		}
	}
	static void Display()
	{
		if(arr[Front]==0)
		{
			System.out.print("Queue is Empty");
		}
		else
		{
				for(int i=Front;i<=Rear;i++)
				{
					System.out.print("\t"+arr[i]);
				}
		}
	}
	static void Dequeue()
	{
	//	if(Rear==-1 && Front==-1 && Front==5 && Rear==5)
		if(arr[Front]==0)
		{
			System.out.print("Queue is Empty");
		}
		else
		{
			System.out.print(arr[Front]+" is Removed");
			Front=Front+1;
		}
	}

}
