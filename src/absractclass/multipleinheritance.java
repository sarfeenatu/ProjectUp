package absractclass;

interface Animal1
{
	void breed();
	void food();
	
}

interface Little
{
	void sizes();
}
class Cats implements Animal1,Little
{

	@Override
	public void breed() {
		System.out.println("cat breed");
		
	}

	@Override
	public void food() {
		System.out.println("cat food");
		
	}

	@Override
	public void sizes() {
		System.out.println("2nd interface");
		
	}
	
}

public class multipleinheritance {

	public static void main(String[] args) {
		Cats c=new Cats();
		c.breed();
		c.food();
		c.sizes();

	}

}
