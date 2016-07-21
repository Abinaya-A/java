import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int n,a;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of students");
		n=input.nextInt();		
		int[] height=new int[n];
		System.out.println("Enter the height of students");
		for(int i=0;i<n;i++)
		{
			height[i]=input.nextInt();
		}
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(height[i]<height[j])
			{
				a=height[i];
				height[i]=height[j];
				height[j]=a;
			}
			}
		}	
		
		System.out.println("Enter the student no:");
		int pos=input.nextInt();
		System.out.println(height[pos-1]);		
	}

}
