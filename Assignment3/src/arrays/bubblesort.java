package arrays;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
	int[]arr= {36,19,29,12,5};
	int i,j,temp;
for (i=0;i<arr.length;i++)
{
	for (j=0;j<arr.length-1-i;j++){
if (arr[j]>arr[j+1]);
{
	temp=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
}}}
for (i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
	}

	}}


