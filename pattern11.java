
public class pattern11 
	{
		public static void main(String[] args)
		{
			
			int num=4;
			int OriginalN=num;
			int n=2*num;
			
			
			for(int i=0;i<=n;i++)
			{
				for(int j=0;j<=n;j++)
				{
					int atEveryindex=OriginalN-Math.min(Math.min(i, j),Math.min(n-i, n-j));
					
					System.out.print( atEveryindex+" ");
		
				
			}
				System.out.println();
		}

	}
	}