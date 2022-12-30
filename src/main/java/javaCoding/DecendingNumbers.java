package javaCoding;

import java.util.Scanner;

public class DecendingNumbers {

	public static void main(String[] args) {
		int n, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:"); n = s.nextInt();
		int a[] = new int[n]; System.out.println("Enter all the elements:"); for (int i = 0; i < n; i++) {
		a[i] = s.nextInt();
		}
		for (int i = 0; i < n; i++) { for (int j = i + 1; j < n; j++) { if (a[i] > a[j]) {
		temp = a[i]; a[i] = a[j]; a[j] = temp;
		}
		}
		}
		System.out.print("Descending Order:"); for (int i = n - 1; i > 0; i--) {
		System.out.print(a[i] + ",");
		}
		System.out.print(a[0]);
		}
		

	}


