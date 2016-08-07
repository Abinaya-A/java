import java.util.*;
public class LongestPrefix {
		   public static void main(String[] args) {
			    String[] str = {"camelcam","camelcamp","camper"};
				ArrayList numArray = new ArrayList();
				String str1="";
				String str2="";
				for(int i=1;i<str.length;i++)
				{
					int count = 0;
					str1 = str[i-1];
				    str2= str[i];
					for(int j=0;(j<str1.length())&&(j<str2.length());j++)
					{
						if(str1.charAt(j)==str2.charAt(j))
						{
							count++;
						}
					}
			     numArray.add(new Integer(count));
				}
				System.out.println(str2);
				System.out.println(str1);
				int[] arrayInt = new int[numArray.size()];
				for(int i=0;i<numArray.size();i++)
				{
					arrayInt[i]=((Integer) numArray.get(i)).intValue();
					System.out.println(arrayInt[i]);
				}
				int maxCountIndex = numArray.indexOf(Collections.max(numArray));
				System.out.println("Maximum prefix value = "+str[maxCountIndex].substring(0, arrayInt[maxCountIndex]));
			}
}