	import java.util.Scanner;

	public class Once {

		public static void main(String[] args) {
			int i;
			int j;
			int count=0;
			Scanner input=new Scanner(System.in);		
			System.out.println("Enter the array size");
			int n=input.nextInt();
			int[] num=new int[n];	
			System.out.println("Enter the array value");
			for(i=0;i<n;i++)
			{
			num[i]=input.nextInt();
			}
			input.close();
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(num[i]==num[j])
					{
					count++;	
					}
			}
					if(count==1)
					{
						System.out.println(num[i]);
					}	
					count=0;
			}
		}
	}