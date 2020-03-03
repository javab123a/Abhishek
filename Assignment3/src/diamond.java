

public class diamond {

	public static void main(String[] args) {
		int noofcolumns=1;
		int i,j;
		{
			for(i=1;i<=7;i++)
			{
				for(j=1;j<=noofcolumns;j++)
				{
					System.out.print(" *");
				}
				System.out.println();
				if (i<4) {
				noofcolumns=noofcolumns+2;
			}
				else {
					noofcolumns=noofcolumns-2;
				}
		}
			
	}

	}}

