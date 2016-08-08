public class DuplicateString {
public static void main(String[] args) {
		String s="malayalam";
		int n=s.length();
		char ch;
		String op=" ";
		for(int i=0;i<n;i++)
		{
			ch=s.charAt(i);
			if(ch!=' ')
			{
				op=op+ch;
				s=s.replace(ch, ' ');
			}
		}
		System.out.println(op);
	}
}