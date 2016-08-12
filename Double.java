import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		if(str.length()%2==0)
		{
			String str1=str.substring(0,str.length()/2);
			String str2=str.substring(str.length()/2,str.length());
			if(str1.equals(str2))
			{
				System.out.println("The given string is  repeat");
			}
			else
			{
				System.out.println("The given strinng is not repeat");
			}
		}
		if(str.length()%2!=0)
		{
			String str1=str.substring(0,str.length()/2);
			String str2=str.substring(str.length()/2+1,str.length());
			if(str1.equals(str2))
			{
				System.out.println("The given string is  repeat");
			}
			else
			{
				System.out.println("The given strinng is not repeat");
			}
		}

	}

}
