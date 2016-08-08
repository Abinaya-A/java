import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		input.close();
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum+=rem;
			num=num/10;
		}
		System.out.println("The sum of the number is :"+sum);
		int sum1=sum;
		int rev=0;
		while(sum>0)
		{
			int rem=sum%10;
			rev=rev*10+rem;
			sum=sum/10;
		}
		if(rev==sum1)
		{
			System.out.println("The sum of the given number is Palindrome");
		}
		else
		{
			System.out.println("The sum of the given number is not Palindrome");
		}
	}
}