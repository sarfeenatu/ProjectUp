package arrayspgm;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int i,s=0;
		int a[]=new int[3];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		for(i=0;i<=2;i++)
		{
			
		
			a[i]=sc.nextInt();
			s=s+a[i];
		}
		System.out.println("Sum is "+s);
		System.out.println("Average is "+(s/3));
	}

}
