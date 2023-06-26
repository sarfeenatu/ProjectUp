package methodpgm;

public class ArithmeticOperations {

	public static void main(String[] args) {
		
		ArithmeticOperations ar1=new ArithmeticOperations();
		ArithmeticOperations ar2=new ArithmeticOperations();
		ArithmeticOperations ar3=new ArithmeticOperations();
		ArithmeticOperations ar4=new ArithmeticOperations();
		ar1.add();
		ar2.subtr(100, 70);
		
		System.out.println("result of multiplication: "+ar3.multi());
		
		System.out.println("result of division: "+ar4.div(300,20));
		
		
	}
	
	
	public void add()
	{
		int a=10,b=30;
		int s=a+b;
		System.out.println("result of addition: "+s);
	}
	public void subtr(int a,int b)
	{
		int s=a-b;
		System.out.println("result of subtraction: "+s);
	}
	
	public int multi()
	{
		int a=60,b=50,m;
		m=a*b;
		return m;
		
	}
	
	public double div(double a,double b)
	{
	    return a/b;	
	}

}
