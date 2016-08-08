import java.util.Scanner;


public class Ones {

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		
		int[] arr=new int[a];
		int temp;
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<arr.length-1;i++)
			{
				if(arr[i]<arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		for(int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");
		}
	}

}
