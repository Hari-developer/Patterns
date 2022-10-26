
public class pattern9 {

	public static void main(String[] args) {
		
		int num=4;
		
		
		for(int i=1;i<=2*num;i++)
		{
			int totalColmsInRow=i>num?2*num-i:i;
			
			
			for(int s=0;s<num-totalColmsInRow;s++)
			{
				System.out.print("  ");
			}
			for(int j=totalColmsInRow;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			for(int j=2;j<=totalColmsInRow;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
