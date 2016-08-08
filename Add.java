import java.util.Scanner;


public class Add {
	
	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		Scanner input= new Scanner(System.in);
		int a=input.nextInt();
		int[] arr=new int[a];
		System.out.println("Enter the elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=input.nextInt();
		}
		input.close();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==0)
				{
					System.out.println(arr[i]);
					System.out.println(arr[j]);
				}
			}
		}

	}

}
