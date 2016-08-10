package Player;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner input=new Scanner(System.in);		 
		int n=input.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=input.nextInt();
		}
		System.out.println("How many times to rotate ?");
		int R=input.nextInt();
		input.close();
		for(int i=R+1;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int i=0;i<=R;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
