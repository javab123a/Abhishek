package arrays;

import java.util.Scanner;

public class maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner (System.in);
int num;
System.out.println("enter element");
num=sc.nextInt();
int arr[]=new int [num];
System.out.println("enter element");
for (int i=0;i<num;i++)
{
	arr[i]=sc.nextInt();
}
int min=arr[0];
int max=arr[0];
for (int i=1;i<num;i++){
	if (arr [i]>max);{
		max=arr[i];
	}
}
System.out.println("max element is"+max);
System.out.println("min element is"+min);
	}

}
