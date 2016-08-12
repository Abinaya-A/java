import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=input.nextInt();
		System.out.println("Enter the divider");
		int div=input.nextInt();
		input.close();
		int quo=0;
		while(num>=div)
		{
			num-=div;
			quo++;
		}
		System.out.println("The quotient is : "+quo);

	}

}
