
public class pattern4 
{
	public static void main(String[] args)
	{
		int num=5;
		
		for(int i=1;i<2*num;i++)
		{
			int totalColsInRow=i>num ? 2*num-i :i;
			
			for(int j=1;j<=totalColsInRow;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
