import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the three numbers");
		num1=input.nextInt();
		num2=input.nextInt();
		num3=input.nextInt();	
		input.close();
		if(num1>num2&&num1>num3)
		{
			System.out.println("The largest nummber is : "+num1);
		}
		else if(num2>num3)
		{
			System.out.println("The largest number is : "+num2);
		}
		else
		{
			System.out.println("The largest  number is : "+num3);
		}
	}

}
