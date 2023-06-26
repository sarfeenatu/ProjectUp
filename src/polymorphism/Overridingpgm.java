package polymorphism;
class RBI
{
	int FD=10000;
	
	public RBI()
	{
		System.out.println("Super class constructor ");
	}
	
	public void interest()
	{
	System.out.println("Interest rate is 7%");
	}
}

class SBI extends RBI
{
	//@Override    
	// rt click select source ->overriding
	
	public SBI()
	{
		super();//this will invoke super class constructor
		//super class constructor can be accessed only through base class constructor
	}
	
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("super class instance in subclass"+super.FD);//invoking super class variable
		System.out.println("Interest rate is 6%");
		super.interest();
	}
	
}


public class Overridingpgm {
	
	
	public static void main(String[] args) {
		
		SBI obj=new SBI();
		obj.interest();
		
	}

}
