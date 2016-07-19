public class Reg 
	{
	public static void main(String[] args)
	{
	int[] num=new int[]{1,2,4,5,7,4,8};
	for(int i=0;i<num.length;i++)
	{
		for(int j=i+1;j<num.length;j++)
		{
			if((num[i])==(num[j]))
			{
				System.out.println(num[i]);
			}
		}
	}
}
}