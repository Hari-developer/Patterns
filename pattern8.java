
public class pattern8 {

	public static void main(String[] args) {
		
		int num=5;
		
		for(int i=1;i<=num;i++)
		{
			for(int s=0;s<num-i;s++)
			{
				System.out.print("  ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		

	}

}
