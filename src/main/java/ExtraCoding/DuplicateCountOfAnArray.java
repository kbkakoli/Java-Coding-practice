package ExtraCoding;

import java.util.Scanner;

public class DuplicateCountOfAnArray {

	public static void main(String[] args) {
		int n, count=0;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array: "); n = s.nextInt();
		int a[] = new int[n];
		System.out.println("Enter all the numbers: "); for (int i = 0; i < n; i++)
		{
		a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++)
		{
		for (int j = i + 1; j < n; j++)
		{
		if(a[i]==a[j]) { count++;
		}
		}}
		System.out.println(count);
		}
		


	}


