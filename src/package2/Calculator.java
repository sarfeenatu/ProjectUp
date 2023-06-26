package package2;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int a,b;
		char c;
		System.out.println("Enter two numbers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter operator");
		c=sc.next().charAt(0);
		switch(c)
		{
		case '+':System.out.println((a+b));break;
		case '-':System.out.println((a-b));break;
		case '*':System.out.println((a*b));break;
		case '/':if(b==0)
                 System.out.println("division not possible");
		         else
			     System.out.println((a/b));break;
		default :System.out.println("invalid");
		}
	}

}
