package inheritance;

interface A
{
	void abc();
	
}
interface B extends A
{
	void Bmethod();
	
}

interface C extends A
{
	void Cmethod();
	
}

class D implements B,C
{

	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("inside A");
	}

	@Override
	public void Cmethod() {
		// TODO Auto-generated method stub
		System.out.println("inside C interface");
		
	}

	@Override
	public void Bmethod() {
		// TODO Auto-generated method stub
		System.out.println("inside B interface");
	}
	
}
public class Hybrid {

	public static void main(String[] args) {
		D obj=new D();
		obj.abc();
		obj.Bmethod();
		obj.Cmethod();
	}

}
