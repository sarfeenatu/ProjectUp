package arrayspgm;

import java.util.Scanner;

public class ScanInput {

	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enter numbers");
		for(i=0;i<=4;i++)
		{
			a[i]=sc.nextInt(); 
		}
		for(i=0;i<=4;i++)
		{
			System.out.println("Value at index "+i+" is "+a[i]);
		}

	}

}
