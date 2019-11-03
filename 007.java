import java.util.*;

class Main
{
	public static void main(String[] Args)
	{
		int max = Integer.valueOf(Args[0]);
		int min = Integer.valueOf(Args[0]);
		for(int i=0; i<Args.length;i++)
		{
			int s = Integer.parseInt(Args[i]);
			if(min>s)
			{
				min = s;
			}
			if(max<s)
			{
				max = s;
			}
		}
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);
		
	}
}