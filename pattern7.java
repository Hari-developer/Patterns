
public class pattern7 {

	public static void main(String[] args) {
	
		
		int num=8;

		
		for(int i=0;i<num;i++)
		{
			
			for(int spaces=0;spaces<num-i;spaces++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
				
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
			
		}
	}

}
