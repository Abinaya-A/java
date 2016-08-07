import java.util.Scanner;

public class VoworConso {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter the character");
		Scanner input=new Scanner(System.in);
		str=input.nextLine();
		input.close();
		char[] ch=str.toCharArray();
		if(ch[0]=='a'||ch[0]=='e'||ch[0]=='i'||ch[0]=='o'||ch[0]=='u'||ch[0]=='A'||ch[0]=='E'||ch[0]=='I'||ch[0]=='O'||ch[0]=='U')
		{
			System.out.println("The given character is vowel");
		}
		else
		{
			System.out.println("The given character is consonent");
		}
	}

}
