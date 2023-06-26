package multidimensionalarray;

import java.util.Scanner;

public class Multidimensional {

	public static void main(String[] args) {
		int i,j;
		int a[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers:");
         for(i=0;i<2;i++)
        	 for(j=0;j<2;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Entered numbers are:");
		for(i=0;i<2;i++)
       	 for(j=0;j<2;j++)
       		 System.out.println(+a[i][j]);

	}

}
