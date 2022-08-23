import java.util.Scanner;
class Pattern1
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of pattern : ");	

		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
}