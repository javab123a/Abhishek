package arrays;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []arr= {22,56,11,78,65,43};
int i,j,temp=0,min;
for (i=0;i<arr.length;i++)
{
	min=i;
	for(j=i+1;j<arr.length;j++)
	{
		if (arr[j]<arr[min])
		{
			min=j;
		}
	}
			temp=arr[i];
			arr[i]=arr[min];
			arr[min]=temp;
		}
		for (i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
	


