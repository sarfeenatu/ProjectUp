package arrayspgm;

import java.util.Scanner;

public class NamePrinting {

	public static void main(String[] args) {
		int i;
		String a[]=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 names");
		for(i=0;i<5;i++)
		{
			a[i]=sc.next();
		}
		System.out.println("The entered names are:")
		for(i=0;i<5;i++)
			System.out.println(a[i]);

	}

}
