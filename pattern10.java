

public class pattern10
{
	public static void main(String[] args)
	{
		
		int num=4;
		
		 num=2*num;
		 
		
		
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=num;j++)
			{
				int atEveryindex=Math.min(Math.min(i, j),Math.min(num-i, num-j));
				
				System.out.print( atEveryindex+" ");
	
			
		}
			System.out.println();
	}

}
}
