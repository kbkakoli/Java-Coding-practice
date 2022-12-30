package javaCoding;

import java.util.Scanner;

public class CountGivenNumber {

	public static void main(String[] args) 
		{ int n,i=0;
		System.out.println("Enter a number");
		Scanner get=new Scanner(System.in); n=get.nextInt();
		while(n>0)
		{
		 
		n=n/10; i++;
		}
		System.out.println("No of digits present: "+i);
		}
		}


	


