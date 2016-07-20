
import java.util.Scanner;

public class Rep {
	
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);		
		String name=input.nextLine();
		String[] str=name.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			char[] ch=str[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}	
	}
}
