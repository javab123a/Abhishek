package practice;

public class pyramid {

	public static void main(String[] args) {
		int i,j;
		for (i=1;i<=4;i++)
		{
			for (j=4;j>=1;j--)
			{
				if (j>i) {
						System.out.print(" ");
			}
			else 
			{
				System.out.print(" *");
		}
	}
System.out.println();
}}}
