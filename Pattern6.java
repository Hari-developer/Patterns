
public class Pattern6 {

	public static void main(String[] args) {

		int num=6;
		
		for(int i=1;i<2*num;i++)
		{
			int totalColmsInRow=i>num?2*num-i:i;
			
			int totalSpaces=num-totalColmsInRow;
			for(int s=1;s<=totalSpaces;s++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=totalColmsInRow;j++)
			{
				System.out.print(" *");
			}
			System.out.println();
			
		}
	}

}
