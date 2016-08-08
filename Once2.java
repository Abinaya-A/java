	import java.util.Scanner;

	public class Once2 {

		public static void main(String[] args) {
			int a;
			int b;
			int count=0;
			Scanner input=new Scanner(System.in);		
			System.out.println("Enter the array size");
			int n=input.nextInt();
			int[] num=new int[n];	
			System.out.println("Enter the array value");
			for(a=0;a<n;a++)
			{
			num[a]=input.nextInt();
			}
			input.close();
			for(a=0;a<n;a++)
			{
				for(b=0;b<n;b++)
				{
					if(num[a]==num[b])
					{
					count++;	
					}
			}
					if(count==1)
					{
						System.out.println(num[a]);
					}	
					count=0;
			}
		}
	}