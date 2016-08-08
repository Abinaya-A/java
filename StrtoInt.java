import java.util.Scanner;
public class StrtoInt {
	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		int num=Integer.parseInt(str);
		System.out.println("The converted number from string is : "+num);
	}
}
