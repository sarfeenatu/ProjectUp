package absractclass;


abstract class Car
{
	abstract public void speedlimit();
	public void cardetails()
	{
		System.out.println("car details");
	}
	
}

class Suzuki extends Car
{

	@Override
	public void speedlimit() {
		System.out.println("Suzuki speed limit");
		
	}
	
}

class Kia extends Car
{

	@Override
	public void speedlimit() {
		
		System.out.println("Kia speed limit");
		
	}
	
}
public class Abstactexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Suzuki s=new Suzuki();
		s.speedlimit();
		s.cardetails();
		Kia k=new Kia();
		k.speedlimit();
		k.cardetails();
	}

}
