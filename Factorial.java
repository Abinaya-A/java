import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		int fact=1;
		input.close();
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of the  number "+num+" is : "+fact);

	}

}
