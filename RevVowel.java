package Player;

import java.util.Scanner;

public class RevVowel {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner input=new Scanner(System.in);
		String s1=input.nextLine();
		input.close();
		String novowel="";
		StringBuffer str=new StringBuffer(s1);
		str.reverse();
		System.out.println("The reverse of the string : "+str);
		String s2=new String(str);
		for(int i=0;i<s2.length();i++)
		{
		if(s2.charAt(i)=='a'||s2.charAt(i)=='e'||s2.charAt(i)=='i'||s2.charAt(i)=='o'||s2.charAt(i)=='u')
		{
		}
		else
		{
			novowel+=s2.charAt(i);
		}
		}
		System.out.println("The string without vowels : "+novowel);
		

	}

}
