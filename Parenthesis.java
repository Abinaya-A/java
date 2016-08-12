import java.util.Scanner;

public class Parenthesis {

	public static void main(String[] args) {
		System.out.println("Enter the parenthesis");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		int count=0;
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='('&&ch[i+1]==')')
			{
				count+=2;
			}
		}
		System.out.println(count);

	}

}
