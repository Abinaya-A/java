
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		input.close();
		int sum=num;
		int rev=0;
		while(sum>0)
		{
			int rem=sum%10;
			rev=rev*10+rem;
			sum=sum/10;
		}
				System.out.println("The reverse of the number is "+rev);
	}
}