package absractclass;

import java.util.Scanner;

interface Bank
{
	void accountdeatils(String name);
	void deposit();
	void withdrawal();
	}


class SBI implements Bank
{
	String name,bname="SBI";
	int acno=4512234;
	double balc=1000,amnt;
	@Override
	public void accountdeatils(String name) {
		
		System.out.println("Bank name:"+bname);
		System.out.println("Customer name:"+name);
		System.out.println("Account no:"+acno);
		System.out.println("Balance:"+balc);
		
		
	}
	@Override
	public void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be deposited");
		amnt=sc.nextDouble();
		balc=balc+amnt;
		System.out.println("Balance="+balc);
		
	}
	@Override
	public void withdrawal() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter amount to be withdrawn");
		amnt=sc.nextDouble();
		if(amnt<balc)
		{
		balc=balc-amnt;
		System.out.println("Balance="+balc);
		}
		else
			System.out.println("Withdrawal is not possilble");
		
	}
	
}
public class Bankpgm {

	public static void main(String[] args) {
		SBI obj=new SBI();
		obj.accountdeatils("Anand");
		obj.deposit();
		obj.withdrawal();
		

	}

}
