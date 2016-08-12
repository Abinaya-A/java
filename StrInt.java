import java.util.Scanner;

public class StrInt {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		boolean output=true;
		System.out.println("Enter the string : ");
		 String str=input.nextLine();
		 input.close();
		 try{
		 int num=Integer.parseInt(str);
		 }
		 catch(Exception e)
		 {
			 output=false;
		 }
		 System.out.println("The given string is a number : "+output);

	}

}
