import java.util.Scanner;


public class Lcm {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the first number");
		int a=input.nextInt();
		System.out.println("Enter the second number");
		int b=input.nextInt();
		input.close();
		int lcm=0;
		int max;
		int min;
		int x;
		if(a>b)
		{
			max=a;
			min=b;
		}
		else
		{
			max=b;
			min=a;
		}
		for(int i=1;i<=min;i++)
		{
			x=max*i;
			if(x%min==0)
			{
				lcm=x;
				break;
			}
		}
		System.out.println("The LCM of "+a+" and "+b+" is "+lcm);
	}

}
