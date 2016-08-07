import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		Scanner input=new  Scanner(System.in);
		String alpha;
		System.out.println("Enter the character");
		alpha=input.nextLine();
		input.close();
		char[] alpha1=alpha.toCharArray();
		if((alpha1[0]>64)&&alpha1[0]<91||alpha1[0]>96&&alpha1[0]<123)
		{
			System.out.println("The given Character is a Alphabet");
		}
		else
		{
			System.out.println("The given Character is not a Alphabet");
		}

	}

}
