package polymorphism;

public class Polymorphism {
	
	public void add()
	{
		int a=10,b=35,sum;
		sum=a+b;
		System.out.println("Sum: "+sum);
	}
   public void add(int a,int b)
   {
	   int sum;
	   sum=a+b;
	   System.out.println("Sum: "+sum);
   }
   
   public void add(int a,double b)
   {
	   double sum;
	   sum=a+b;
	   System.out.println("Sum: "+sum);
   }
   
   public void add(double a,int b)
   {
	   double sum;
	   sum=a+b;
	   System.out.println("Sum: "+sum);
   }
	public static void main(String[] args) {
		
		Polymorphism ob=new Polymorphism();
		ob.add();
		ob.add(50,30);
		ob.add(32,55.5);
		ob.add(3.4,20);
				

	}

}
