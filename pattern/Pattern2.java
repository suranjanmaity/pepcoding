import java.util.Scanner;
class Pattern2
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the size of pattern : ");	

		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("* ");	
			}
			System.out.println();
		}
	}
}